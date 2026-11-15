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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cf0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public bf0 a;
    public Drawable a0;
    public org.telegram.ui.Components.uj0 b;
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
    public org.telegram.ui.Components.xi0 i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final HashMap l0;
    public org.telegram.ui.Components.p50 m0;
    public final long n;
    public final ArrayList n0;
    public long o0;
    public boolean p0;
    public final boolean q0;
    public int r;
    public final se0 r0;
    public int s;
    public boolean s0;
    public final te0 t0;
    public final h2.f u0;
    public int w;
    public int x;
    public int y;

    public cf0(long j3, int i7, long j10) {
        super(null);
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new HashMap();
        this.n0 = new ArrayList();
        this.r0 = new se0(this);
        boolean z10 = false;
        this.s0 = false;
        this.t0 = new te0(this);
        this.u0 = new h2.f((int[]) null);
        this.n = j3;
        this.g0 = i7;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(j3));
        this.c = M0;
        this.h = org.telegram.messenger.t3.T(M0) && !this.c.megagroup;
        if (j10 == 0) {
            this.f = org.telegram.messenger.m10.i(getAccountInstance().a).n;
        } else {
            this.f = j10;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f));
        if (this.f == org.telegram.messenger.m10.i(getAccountInstance().a).n || (a22 != null && !a22.bot)) {
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
    public static void Z(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j3 = cf0Var.f;
        ArrayList arrayList = cf0Var.k0;
        ArrayList arrayList2 = cf0Var.j0;
        ue0 l02 = cf0Var.l0();
        cf0Var.X = false;
        cf0Var.c0 = false;
        if (tL_chatInviteExported != null) {
            cf0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = cf0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i7 = 0; i7 < tL_messages_exportedChatInvites.invites.size(); i7++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i7);
                    cf0Var.i0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j3 != org.telegram.messenger.m10.i(cf0Var.getAccountInstance().a).n && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    cf0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    cf0Var.i0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i11 = 0; i11 < tL_messages_exportedChatInvites.users.size(); i11++) {
                cf0Var.l0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i11).id), tL_messages_exportedChatInvites.users.get(i11));
            }
            int i12 = cf0Var.Y;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                cf0Var.c0 = false;
            } else if (z10) {
                cf0Var.c0 = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                cf0Var.c0 = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !cf0Var.h0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.xi0 xi0Var = cf0Var.i0;
                if (xi0Var != null && !cf0Var.isPaused) {
                    xi0Var.b(i12 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = cf0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                cf0Var.getMessagesStorage().w1(cf0Var.d.invitesCount, cf0Var.n);
            }
        } else {
            cf0Var.c0 = false;
            z11 = false;
        }
        if (cf0Var.c0 || cf0Var.s0 || j3 != org.telegram.messenger.m10.i(cf0Var.getAccountInstance().a).n) {
            if (cf0Var.c0 || cf0Var.s0) {
                z12 = false;
                if (cf0Var.c0) {
                }
                cf0Var.resumeDelayedFragmentAnimation();
                if (z12) {
                    cf0Var.j0(false);
                }
                if (!z11 && cf0Var.a != null && cf0Var.b.getChildCount() > 0) {
                    cf0Var.n0(l02);
                    return;
                }
                cf0Var.o0(true);
            }
            cf0Var.c0 = true;
            cf0Var.s0 = true;
        } else {
            cf0Var.c0 = true;
            cf0Var.e0 = true;
        }
        z12 = true;
        if (cf0Var.c0) {
        }
        cf0Var.resumeDelayedFragmentAnimation();
        if (z12) {
        }
        if (!z11) {
        }
        cf0Var.o0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if ((r0.size() + (r7.k0.size() + r7.j0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(cf0 cf0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.xi0 xi0Var;
        ArrayList arrayList = cf0Var.n0;
        cf0Var.X = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i7 = 0; i7 < tL_messages_chatAdminsWithInvites.admins.size(); i7++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i7);
                if (tL_chatAdminWithInvites.admin_id != org.telegram.messenger.m10.i(cf0Var.getAccountInstance().a).n) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.users.size(); i10++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i10);
                cf0Var.l0.put(Long.valueOf(user.id), user);
            }
        }
        int i11 = cf0Var.Y;
        cf0Var.f0 = true;
        cf0Var.c0 = false;
        if (arrayList.size() > 0 && (xi0Var = cf0Var.i0) != null && !cf0Var.isPaused && cf0Var.h0) {
            xi0Var.b(i11 + 1);
        }
        if (cf0Var.c0) {
        }
        cf0Var.resumeDelayedFragmentAnimation();
        if (!cf0Var.c0 && !cf0Var.s0) {
            cf0Var.c0 = true;
            cf0Var.s0 = true;
            cf0Var.j0(false);
        }
        cf0Var.o0(true);
    }

    public static void b0(cf0 cf0Var) {
        if (cf0Var.f != org.telegram.messenger.m10.i(cf0Var.getAccountInstance().a).n) {
            cf0Var.k0(cf0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = cf0Var.getMessagesController().j1(-cf0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = cf0Var.e;
        cf0Var.e = null;
        cf0Var.d.exported_invite = null;
        int sendRequest = cf0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ne0(cf0Var, tL_chatInviteExported, 0));
        org.telegram.messenger.g0.a4(cf0Var.b);
        cf0Var.getConnectionsManager().bindRequestToGuid(sendRequest, cf0Var.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749140, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 16));
        k0 k0Var = new k0(15, context, this);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.b.setLayoutManager(b0Var);
        org.telegram.ui.Components.uj0 uj0Var2 = this.b;
        bf0 bf0Var = new bf0(this, context);
        this.a = bf0Var;
        uj0Var2.setAdapter(bf0Var);
        this.b.setOnScrollListener(new bi.w3(8, this, b0Var));
        this.i0 = new org.telegram.ui.Components.xi0(this.b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
        this.b.setOnItemClickListener(new fi.i4(19, this, context));
        this.b.setOnItemLongClickListener(new pe0(this));
        this.Z = context.getDrawable(R.drawable.msg_link_1);
        this.a0 = context.getDrawable(R.drawable.msg_link_2);
        this.b0 = context.getDrawable(R.drawable.large_income);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.y1 && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var == null || o4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.uj0 uj0Var = this.b;
        if (uj0Var != null) {
            int childCount = uj0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.b.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.t70) {
                    ((org.telegram.ui.Components.t70) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.p50 p50Var = this.m0;
        if (p50Var != null) {
            p50Var.updateColors();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().j1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ne0(this, tL_chatInviteExported, 1));
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        boolean z11 = this.e0;
        long j3 = this.n;
        if (!z11 || this.f0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(j10);
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
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new di.k8(this, this.p0 ? null : this.e, z12, 7)), getClassGuid());
        } else {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().j1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new me0(this, 0)), getClassGuid());
        }
        if (z10) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().j1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ne0(this, tL_chatInviteExported, 2));
    }

    public final ue0 l0() {
        ue0 ue0Var = new ue0(this);
        ue0Var.f(ue0Var.i);
        ue0Var.c = this.E;
        ue0Var.d = this.F;
        ue0Var.e = this.I;
        ue0Var.f = this.J;
        ue0Var.g = this.V;
        ue0Var.h = this.W;
        ue0Var.b = this.Y;
        ue0Var.k.clear();
        ue0Var.k.addAll(this.j0);
        ue0Var.l.clear();
        ue0Var.l.addAll(this.k0);
        return ue0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.p0 = org.telegram.messenger.t3.t0(this.c);
        j0(true);
    }

    public final void n0(ue0 ue0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            o0(true);
            return;
        }
        o0(false);
        ue0Var.f(ue0Var.j);
        v4.o.c(ue0Var, true).c(this.a);
        org.telegram.messenger.g0.a4(this.b);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        bf0 bf0Var;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(this.n));
        this.c = M0;
        if (M0 == null) {
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
        boolean z11 = this.f != org.telegram.messenger.m10.i(getAccountInstance().a).n;
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
                bf0Var = this.a;
                if (bf0Var == null && z10) {
                    bf0Var.f();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i27 = this.Y;
            this.Y = i27 + 1;
            this.L = i27;
        }
        bf0Var = this.a;
        if (bf0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.y1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        bf0 bf0Var = this.a;
        if (bf0Var != null) {
            bf0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.p50 p50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.h0 = true;
            if (z11 && (p50Var = this.m0) != null && p50Var.g2) {
                p50Var.show();
            }
        }
        this.u0.e();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.u0.d();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
