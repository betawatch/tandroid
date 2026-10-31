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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kg0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int X;
    public Drawable Y;
    public Drawable Z;
    public jg0 a;
    public Drawable a0;
    public org.telegram.ui.Components.tk0 b;
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
    public org.telegram.ui.Components.wj0 h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final HashMap k0;
    public org.telegram.ui.Components.c60 l0;
    public final ArrayList m0;
    public final long n;
    public long n0;
    public boolean o0;
    public final boolean p0;
    public final zf0 q0;
    public int r;
    public boolean r0;
    public int s;
    public final ag0 s0;
    public final e2.f t0;
    public int w;
    public int x;
    public int y;

    public kg0(long j10, int i10, long j11) {
        super(null);
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new HashMap();
        this.m0 = new ArrayList();
        this.q0 = new zf0(this);
        boolean z10 = false;
        this.r0 = false;
        this.s0 = new ag0(this);
        this.t0 = new e2.f(null);
        this.n = j10;
        this.f0 = i10;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(j10));
        this.c = L0;
        this.h = org.telegram.messenger.w3.T(L0) && !this.c.megagroup;
        if (j11 == 0) {
            this.f = org.telegram.messenger.d20.i(getAccountInstance().a).n;
        } else {
            this.f = j11;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f));
        if (this.f == org.telegram.messenger.d20.i(getAccountInstance().a).n || (Z1 != null && !Z1.bot)) {
            z10 = true;
        }
        this.p0 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
    
        if ((r9.m0.size() + (r2.size() + r3.size())) >= 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(kg0 kg0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j10 = kg0Var.f;
        ArrayList arrayList = kg0Var.j0;
        ArrayList arrayList2 = kg0Var.i0;
        bg0 k02 = kg0Var.k0();
        kg0Var.W = false;
        kg0Var.b0 = false;
        if (tL_chatInviteExported != null) {
            kg0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = kg0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    kg0Var.h0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j10 != org.telegram.messenger.d20.i(kg0Var.getAccountInstance().a).n && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    kg0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11);
                    kg0Var.h0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i12 = 0; i12 < tL_messages_exportedChatInvites.users.size(); i12++) {
                kg0Var.k0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i12).id), tL_messages_exportedChatInvites.users.get(i12));
            }
            int i13 = kg0Var.X;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                kg0Var.b0 = false;
            } else if (z10) {
                kg0Var.b0 = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                kg0Var.b0 = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !kg0Var.g0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.wj0 wj0Var = kg0Var.h0;
                if (wj0Var != null && !kg0Var.isPaused) {
                    wj0Var.b(i13 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = kg0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                kg0Var.getMessagesStorage().w1(kg0Var.d.invitesCount, kg0Var.n);
            }
        } else {
            kg0Var.b0 = false;
            z11 = false;
        }
        if (kg0Var.b0 || kg0Var.r0 || j10 != org.telegram.messenger.d20.i(kg0Var.getAccountInstance().a).n) {
            if (kg0Var.b0 || kg0Var.r0) {
                z12 = false;
                if (kg0Var.b0) {
                }
                kg0Var.resumeDelayedFragmentAnimation();
                if (z12) {
                    kg0Var.i0(false);
                }
                if (!z11 && kg0Var.a != null && kg0Var.b.getChildCount() > 0) {
                    kg0Var.m0(k02);
                    return;
                }
                kg0Var.n0(true);
            }
            kg0Var.b0 = true;
            kg0Var.r0 = true;
        } else {
            kg0Var.b0 = true;
            kg0Var.d0 = true;
        }
        z12 = true;
        if (kg0Var.b0) {
        }
        kg0Var.resumeDelayedFragmentAnimation();
        if (z12) {
        }
        if (!z11) {
        }
        kg0Var.n0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if ((r0.size() + (r7.j0.size() + r7.i0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(kg0 kg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.wj0 wj0Var;
        ArrayList arrayList = kg0Var.m0;
        kg0Var.W = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.admins.size(); i10++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i10);
                if (tL_chatAdminWithInvites.admin_id != org.telegram.messenger.d20.i(kg0Var.getAccountInstance().a).n) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i11 = 0; i11 < tL_messages_chatAdminsWithInvites.users.size(); i11++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i11);
                kg0Var.k0.put(Long.valueOf(user.id), user);
            }
        }
        int i12 = kg0Var.X;
        kg0Var.e0 = true;
        kg0Var.b0 = false;
        if (arrayList.size() > 0 && (wj0Var = kg0Var.h0) != null && !kg0Var.isPaused && kg0Var.g0) {
            wj0Var.b(i12 + 1);
        }
        if (kg0Var.b0) {
        }
        kg0Var.resumeDelayedFragmentAnimation();
        if (!kg0Var.b0 && !kg0Var.r0) {
            kg0Var.b0 = true;
            kg0Var.r0 = true;
            kg0Var.i0(false);
        }
        kg0Var.n0(true);
    }

    public static void a0(kg0 kg0Var) {
        if (kg0Var.f != org.telegram.messenger.d20.i(kg0Var.getAccountInstance().a).n) {
            kg0Var.j0(kg0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = kg0Var.getMessagesController().i1(-kg0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = kg0Var.e;
        kg0Var.e = null;
        kg0Var.d.exported_invite = null;
        int sendRequest = kg0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new tf0(kg0Var, tL_chatInviteExported, 0));
        org.telegram.messenger.i0.a4(kg0Var.b);
        kg0Var.getConnectionsManager().bindRequestToGuid(sendRequest, kg0Var.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749150, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 6));
        l0 l0Var = new l0(this, context, 16);
        this.fragmentView = l0Var;
        l0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        dh.f fVar = new dh.f(1, false, 11);
        this.b.setLayoutManager(fVar);
        org.telegram.ui.Components.tk0 tk0Var2 = this.b;
        jg0 jg0Var = new jg0(this, context);
        this.a = jg0Var;
        tk0Var2.setAdapter(jg0Var);
        this.b.setOnScrollListener(new bi.t3(8, this, fVar));
        this.h0 = new org.telegram.ui.Components.wj0(this.b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new mg.q0(18, this, context));
        this.b.setOnItemLongClickListener(new wf0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        n0(true);
        this.n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.y1 && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var == null || z4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void f0() {
        org.telegram.ui.Components.tk0 tk0Var = this.b;
        if (tk0Var != null) {
            int childCount = tk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.j80) {
                    ((org.telegram.ui.Components.j80) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.c60 c60Var = this.l0;
        if (c60Var != null) {
            c60Var.updateColors();
        }
    }

    public final void g0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().i1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new tf0(this, tL_chatInviteExported, 1));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i10;
        }
    }

    public final void i0(boolean z10) {
        boolean z11 = this.d0;
        long j10 = this.n;
        if (!z11 || this.e0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-j10);
            long e = getUserConfig().e();
            long j11 = this.f;
            if (j11 == e) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().n1(j11);
            }
            boolean z12 = this.r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new wd(this, this.o0 ? null : this.e, z12, 4)), getClassGuid());
        } else {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().i1(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new sf0(this, 0)), getClassGuid());
        }
        if (z10) {
            n0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().i1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new tf0(this, tL_chatInviteExported, 2));
    }

    public final bg0 k0() {
        bg0 bg0Var = new bg0(this);
        bg0Var.f(bg0Var.i);
        bg0Var.c = this.D;
        bg0Var.d = this.E;
        bg0Var.e = this.H;
        bg0Var.f = this.I;
        bg0Var.g = this.U;
        bg0Var.h = this.V;
        bg0Var.b = this.X;
        bg0Var.k.clear();
        bg0Var.k.addAll(this.i0);
        bg0Var.l.clear();
        bg0Var.l.addAll(this.j0);
        return bg0Var;
    }

    public final void l0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.o0 = org.telegram.messenger.w3.t0(this.c);
        i0(true);
    }

    public final void m0(bg0 bg0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            n0(true);
            return;
        }
        n0(false);
        bg0Var.f(bg0Var.j);
        s4.n.c(bg0Var, true).c(this.a);
        org.telegram.messenger.i0.a4(this.b);
    }

    public final void n0(boolean z10) {
        jg0 jg0Var;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(this.n));
        this.c = L0;
        if (L0 == null) {
            return;
        }
        this.Q = -1;
        this.R = -1;
        this.D = -1;
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
        this.y = -1;
        this.V = -1;
        this.U = -1;
        this.T = -1;
        this.S = -1;
        this.P = -1;
        this.x = -1;
        this.G = -1;
        this.X = 0;
        boolean z11 = this.f != org.telegram.messenger.d20.i(getAccountInstance().a).n;
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
        this.w = i12 + 1;
        ArrayList arrayList = this.i0;
        if (!z11) {
            this.x = i13;
            this.X = i12 + 4;
            this.y = i12 + 3;
        } else if (!arrayList.isEmpty()) {
            int i14 = this.X;
            this.x = i14;
            this.X = i14 + 2;
            this.P = i14 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.X;
            this.D = i15;
            int size = arrayList.size() + i15;
            this.X = size;
            this.E = size;
        }
        if (!z11 && arrayList.isEmpty() && this.y >= 0 && (!this.W || this.d0 || this.r0)) {
            int i16 = this.X;
            this.X = i16 + 1;
            this.O = i16;
        }
        if (!z11) {
            ArrayList arrayList2 = this.m0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.y >= 0) && this.O == -1) {
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
            } else if ((!arrayList.isEmpty() || this.y >= 0) && this.O == -1) {
                int i21 = this.X;
                this.X = i21 + 1;
                this.J = i21;
            } else if (z11 && this.D == -1) {
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
                jg0Var = this.a;
                if (jg0Var == null && z10) {
                    jg0Var.f();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i28 = this.X;
            this.X = i28 + 1;
            this.K = i28;
        }
        jg0Var = this.a;
        if (jg0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        jg0 jg0Var = this.a;
        if (jg0Var != null) {
            jg0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.c60 c60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.g0 = true;
            if (z11 && (c60Var = this.l0) != null && c60Var.c2) {
                c60Var.show();
            }
        }
        this.t0.e();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.t0.d();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
