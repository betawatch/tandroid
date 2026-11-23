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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ff0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public int W;
    public boolean X;
    public int Y;
    public Drawable Z;
    public ef0 a;
    public Drawable a0;
    public org.telegram.ui.Components.ek0 b;
    public Drawable b0;
    public TLRPC.Chat c;
    public boolean c0;
    public TLRPC.ChatFull d;
    public boolean d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean e0;
    public final long f;
    public boolean f0;
    public final int g0;
    public final boolean h;
    public boolean h0;
    public org.telegram.ui.Components.hj0 i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final HashMap l0;
    public org.telegram.ui.Components.a60 m0;
    public final long n;
    public final ArrayList n0;
    public long o0;
    public boolean p0;
    public final boolean q0;
    public int r;
    public final ve0 r0;
    public int s;
    public boolean s0;
    public final we0 t0;
    public final h2.f u0;
    public int w;
    public int x;
    public int y;

    public ff0(long j3, int i7, long j10) {
        super(null);
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new HashMap();
        this.n0 = new ArrayList();
        this.r0 = new ve0(this);
        boolean z10 = false;
        this.s0 = false;
        this.t0 = new we0(this);
        this.u0 = new h2.f((int[]) null);
        this.n = j3;
        this.g0 = i7;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(j3));
        this.c = O0;
        this.h = org.telegram.messenger.v3.T(O0) && !this.c.megagroup;
        if (j10 == 0) {
            this.f = org.telegram.messenger.k10.i(getAccountInstance().a).n;
        } else {
            this.f = j10;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f));
        if (this.f == org.telegram.messenger.k10.i(getAccountInstance().a).n || (c22 != null && !c22.bot)) {
            z10 = true;
        }
        this.q0 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
    
        if ((r9.n0.size() + (r2.size() + r3.size())) >= 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j3 = ff0Var.f;
        ArrayList arrayList = ff0Var.k0;
        ArrayList arrayList2 = ff0Var.j0;
        xe0 l02 = ff0Var.l0();
        ff0Var.X = false;
        ff0Var.c0 = false;
        if (tL_chatInviteExported != null) {
            ff0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = ff0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i7 = 0; i7 < tL_messages_exportedChatInvites.invites.size(); i7++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i7);
                    ff0Var.i0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j3 != org.telegram.messenger.k10.i(ff0Var.getAccountInstance().a).n && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    ff0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    ff0Var.i0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i11 = 0; i11 < tL_messages_exportedChatInvites.users.size(); i11++) {
                ff0Var.l0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i11).id), tL_messages_exportedChatInvites.users.get(i11));
            }
            int i12 = ff0Var.Y;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                ff0Var.c0 = false;
            } else if (z10) {
                ff0Var.c0 = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                ff0Var.c0 = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !ff0Var.h0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.hj0 hj0Var = ff0Var.i0;
                if (hj0Var != null && !ff0Var.isPaused) {
                    hj0Var.b(i12 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = ff0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                ff0Var.getMessagesStorage().w1(ff0Var.d.invitesCount, ff0Var.n);
            }
        } else {
            ff0Var.c0 = false;
            z11 = false;
        }
        if (ff0Var.c0 || ff0Var.s0 || j3 != org.telegram.messenger.k10.i(ff0Var.getAccountInstance().a).n) {
            if (ff0Var.c0 || ff0Var.s0) {
                z12 = false;
                if (ff0Var.c0) {
                }
                ff0Var.resumeDelayedFragmentAnimation();
                if (z12) {
                    ff0Var.j0(false);
                }
                if (!z11 && ff0Var.a != null && ff0Var.b.getChildCount() > 0) {
                    ff0Var.n0(l02);
                    return;
                }
                ff0Var.o0(true);
            }
            ff0Var.c0 = true;
            ff0Var.s0 = true;
        } else {
            ff0Var.c0 = true;
            ff0Var.e0 = true;
        }
        z12 = true;
        if (ff0Var.c0) {
        }
        ff0Var.resumeDelayedFragmentAnimation();
        if (z12) {
        }
        if (!z11) {
        }
        ff0Var.o0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if ((r0.size() + (r7.k0.size() + r7.j0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.hj0 hj0Var;
        ArrayList arrayList = ff0Var.n0;
        ff0Var.X = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i7 = 0; i7 < tL_messages_chatAdminsWithInvites.admins.size(); i7++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i7);
                if (tL_chatAdminWithInvites.admin_id != org.telegram.messenger.k10.i(ff0Var.getAccountInstance().a).n) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.users.size(); i10++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i10);
                ff0Var.l0.put(Long.valueOf(user.id), user);
            }
        }
        int i11 = ff0Var.Y;
        ff0Var.f0 = true;
        ff0Var.c0 = false;
        if (arrayList.size() > 0 && (hj0Var = ff0Var.i0) != null && !ff0Var.isPaused && ff0Var.h0) {
            hj0Var.b(i11 + 1);
        }
        if (ff0Var.c0) {
        }
        ff0Var.resumeDelayedFragmentAnimation();
        if (!ff0Var.c0 && !ff0Var.s0) {
            ff0Var.c0 = true;
            ff0Var.s0 = true;
            ff0Var.j0(false);
        }
        ff0Var.o0(true);
    }

    public static void b0(ff0 ff0Var) {
        if (ff0Var.f != org.telegram.messenger.k10.i(ff0Var.getAccountInstance().a).n) {
            ff0Var.k0(ff0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = ff0Var.getMessagesController().l1(-ff0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = ff0Var.e;
        ff0Var.e = null;
        ff0Var.d.exported_invite = null;
        int sendRequest = ff0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new qe0(ff0Var, tL_chatInviteExported, 0));
        org.telegram.messenger.g0.Z3(ff0Var.b);
        ff0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ff0Var.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748947, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 18));
        k0 k0Var = new k0(15, context, this);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.b.setLayoutManager(b0Var);
        org.telegram.ui.Components.ek0 ek0Var2 = this.b;
        ef0 ef0Var = new ef0(this, context);
        this.a = ef0Var;
        ek0Var2.setAdapter(ef0Var);
        this.b.setOnScrollListener(new bi.g6(8, this, b0Var));
        this.i0 = new org.telegram.ui.Components.hj0(this.b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        frameLayout.addView(this.b, c8.ma.c(-1.0f, -1));
        this.b.setOnItemClickListener(new fi.g4(19, this, context));
        this.b.setOnItemLongClickListener(new se0(this));
        this.Z = context.getDrawable(R.drawable.msg_link_1);
        this.a0 = context.getDrawable(R.drawable.msg_link_2);
        this.b0 = context.getDrawable(R.drawable.large_income);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.y1 && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var == null || r4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.ek0 ek0Var = this.b;
        if (ek0Var != null) {
            int childCount = ek0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.b.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.g80) {
                    ((org.telegram.ui.Components.g80) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.a60 a60Var = this.m0;
        if (a60Var != null) {
            a60Var.updateColors();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 32, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().l1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new qe0(this, tL_chatInviteExported, 1));
    }

    public final void i0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i7 = tL_chatInviteExported.usage_limit;
        if (i7 > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i7;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        boolean z11 = this.e0;
        long j3 = this.n;
        if (!z11 || this.f0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(j10);
            }
            boolean z12 = this.s0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).date;
                }
            }
            this.X = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new di.o8(this, this.p0 ? null : this.e, z12, 7)), getClassGuid());
        } else {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().l1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new pe0(this, 0)), getClassGuid());
        }
        if (z10) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().l1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new qe0(this, tL_chatInviteExported, 2));
    }

    public final xe0 l0() {
        xe0 xe0Var = new xe0(this);
        xe0Var.f(xe0Var.i);
        xe0Var.c = this.E;
        xe0Var.d = this.F;
        xe0Var.e = this.I;
        xe0Var.f = this.J;
        xe0Var.g = this.V;
        xe0Var.h = this.W;
        xe0Var.b = this.Y;
        xe0Var.k.clear();
        xe0Var.k.addAll(this.j0);
        xe0Var.l.clear();
        xe0Var.l.addAll(this.k0);
        return xe0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.p0 = org.telegram.messenger.v3.t0(this.c);
        j0(true);
    }

    public final void n0(xe0 xe0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            o0(true);
            return;
        }
        o0(false);
        xe0Var.f(xe0Var.j);
        v4.o.c(xe0Var, true).c(this.a);
        org.telegram.messenger.g0.Z3(this.b);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        ef0 ef0Var;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(this.n));
        this.c = O0;
        if (O0 == null) {
            return;
        }
        this.R = -1;
        this.S = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.M = -1;
        this.K = -1;
        this.L = -1;
        this.O = -1;
        this.N = -1;
        this.P = -1;
        this.r = -1;
        this.y = -1;
        this.W = -1;
        this.V = -1;
        this.U = -1;
        this.T = -1;
        this.Q = -1;
        this.x = -1;
        this.H = -1;
        this.Y = 0;
        boolean z11 = this.f != org.telegram.messenger.k10.i(getAccountInstance().a).n;
        if (z11) {
            int i7 = this.Y;
            this.R = i7;
            this.Y = i7 + 2;
            this.S = i7 + 1;
        } else {
            int i10 = this.Y;
            this.Y = i10 + 1;
            this.r = i10;
        }
        int i11 = this.Y;
        this.s = i11;
        int i12 = i11 + 2;
        this.Y = i12;
        this.w = i11 + 1;
        ArrayList arrayList = this.j0;
        if (!z11) {
            this.x = i12;
            this.Y = i11 + 4;
            this.y = i11 + 3;
        } else if (!arrayList.isEmpty()) {
            int i13 = this.Y;
            this.x = i13;
            this.Y = i13 + 2;
            this.Q = i13 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i14 = this.Y;
            this.E = i14;
            int size = arrayList.size() + i14;
            this.Y = size;
            this.F = size;
        }
        if (!z11 && arrayList.isEmpty() && this.y >= 0 && (!this.X || this.e0 || this.s0)) {
            int i15 = this.Y;
            this.Y = i15 + 1;
            this.P = i15;
        }
        if (!z11) {
            ArrayList arrayList2 = this.n0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.y >= 0) && this.P == -1) {
                    int i16 = this.Y;
                    this.Y = i16 + 1;
                    this.U = i16;
                }
                int i17 = this.Y;
                int i18 = i17 + 1;
                this.Y = i18;
                this.T = i17;
                this.V = i18;
                int size2 = arrayList2.size() + i18;
                this.Y = size2;
                this.W = size2;
            }
        }
        ArrayList arrayList3 = this.k0;
        if (!arrayList3.isEmpty()) {
            if (this.V >= 0) {
                int i19 = this.Y;
                this.Y = i19 + 1;
                this.K = i19;
            } else if ((!arrayList.isEmpty() || this.y >= 0) && this.P == -1) {
                int i20 = this.Y;
                this.Y = i20 + 1;
                this.K = i20;
            } else if (z11 && this.E == -1) {
                int i21 = this.Y;
                this.Y = i21 + 1;
                this.K = i21;
            }
            int i22 = this.Y;
            int i23 = i22 + 1;
            this.Y = i23;
            this.M = i22;
            this.I = i23;
            int size3 = arrayList3.size() + i23;
            this.J = size3;
            this.N = size3;
            this.Y = size3 + 2;
            this.O = size3 + 1;
        }
        if (!this.e0 && !this.s0 && ((this.X || this.c0) && !z11)) {
            int i24 = this.Y;
            this.Y = i24 + 1;
            this.G = i24;
        }
        if (!arrayList.isEmpty()) {
            int i25 = this.F;
            int i26 = this.Y;
            if (i25 == i26) {
                this.Y = i26 + 1;
                this.H = i26;
                ef0Var = this.a;
                if (ef0Var == null && z10) {
                    ef0Var.f();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i27 = this.Y;
            this.Y = i27 + 1;
            this.L = i27;
        }
        ef0Var = this.a;
        if (ef0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ls.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ls.y1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        ef0 ef0Var = this.a;
        if (ef0Var != null) {
            ef0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.a60 a60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.h0 = true;
            if (z11 && (a60Var = this.m0) != null && a60Var.g2) {
                a60Var.show();
            }
        }
        this.u0.e();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.u0.d();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
