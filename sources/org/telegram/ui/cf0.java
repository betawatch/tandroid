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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cf0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public bf0 a;
    public Drawable a0;
    public org.telegram.ui.Components.pj0 b;
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
    public org.telegram.ui.Components.si0 h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final HashMap k0;
    public org.telegram.ui.Components.m50 l0;
    public final ArrayList m0;
    public final long n;
    public long n0;
    public boolean o0;
    public final boolean p0;
    public final se0 q0;
    public int r;
    public boolean r0;
    public int s;
    public final te0 s0;
    public final h2.f t0;
    public int w;
    public int x;
    public int y;

    public cf0(long j3, int i7, long j10) {
        super(null);
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new HashMap();
        this.m0 = new ArrayList();
        this.q0 = new se0(this);
        boolean z9 = false;
        this.r0 = false;
        this.s0 = new te0(this);
        this.t0 = new h2.f((int[]) null);
        this.n = j3;
        this.f0 = i7;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j3));
        this.c = M0;
        this.h = org.telegram.messenger.t3.T(M0) && !this.c.megagroup;
        if (j10 == 0) {
            this.f = org.telegram.messenger.p10.i(getAccountInstance().a).n;
        } else {
            this.f = j10;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f));
        if (this.f == org.telegram.messenger.p10.i(getAccountInstance().a).n || (a22 != null && !a22.bot)) {
            z9 = true;
        }
        this.p0 = z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
    
        if ((r9.m0.size() + (r2.size() + r3.size())) >= 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        boolean z10;
        boolean z11;
        long j3 = cf0Var.f;
        ArrayList arrayList = cf0Var.j0;
        ArrayList arrayList2 = cf0Var.i0;
        ue0 l02 = cf0Var.l0();
        cf0Var.W = false;
        cf0Var.b0 = false;
        if (tL_chatInviteExported != null) {
            cf0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = cf0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z9) {
                for (int i7 = 0; i7 < tL_messages_exportedChatInvites.invites.size(); i7++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i7);
                    cf0Var.i0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j3 != org.telegram.messenger.p10.i(cf0Var.getAccountInstance().a).n && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
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
                cf0Var.k0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i11).id), tL_messages_exportedChatInvites.users.get(i11));
            }
            int i12 = cf0Var.X;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                cf0Var.b0 = false;
            } else if (z9) {
                cf0Var.b0 = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                cf0Var.b0 = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !cf0Var.g0) {
                z10 = true;
            } else {
                org.telegram.ui.Components.si0 si0Var = cf0Var.h0;
                if (si0Var != null && !cf0Var.isPaused) {
                    si0Var.b(i12 + 1);
                }
                z10 = false;
            }
            TLRPC.ChatFull chatFull2 = cf0Var.d;
            if (chatFull2 != null && !z9) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                cf0Var.getMessagesStorage().w1(cf0Var.d.invitesCount, cf0Var.n);
            }
        } else {
            cf0Var.b0 = false;
            z10 = false;
        }
        if (cf0Var.b0 || cf0Var.r0 || j3 != org.telegram.messenger.p10.i(cf0Var.getAccountInstance().a).n) {
            if (cf0Var.b0 || cf0Var.r0) {
                z11 = false;
                if (cf0Var.b0) {
                }
                cf0Var.resumeDelayedFragmentAnimation();
                if (z11) {
                    cf0Var.j0(false);
                }
                if (!z10 && cf0Var.a != null && cf0Var.b.getChildCount() > 0) {
                    cf0Var.n0(l02);
                    return;
                }
                cf0Var.o0(true);
            }
            cf0Var.b0 = true;
            cf0Var.r0 = true;
        } else {
            cf0Var.b0 = true;
            cf0Var.d0 = true;
        }
        z11 = true;
        if (cf0Var.b0) {
        }
        cf0Var.resumeDelayedFragmentAnimation();
        if (z11) {
        }
        if (!z10) {
        }
        cf0Var.o0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if ((r0.size() + (r7.j0.size() + r7.i0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(cf0 cf0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.si0 si0Var;
        ArrayList arrayList = cf0Var.m0;
        cf0Var.W = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i7 = 0; i7 < tL_messages_chatAdminsWithInvites.admins.size(); i7++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i7);
                if (tL_chatAdminWithInvites.admin_id != org.telegram.messenger.p10.i(cf0Var.getAccountInstance().a).n) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.users.size(); i10++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i10);
                cf0Var.k0.put(Long.valueOf(user.id), user);
            }
        }
        int i11 = cf0Var.X;
        cf0Var.e0 = true;
        cf0Var.b0 = false;
        if (arrayList.size() > 0 && (si0Var = cf0Var.h0) != null && !cf0Var.isPaused && cf0Var.g0) {
            si0Var.b(i11 + 1);
        }
        if (cf0Var.b0) {
        }
        cf0Var.resumeDelayedFragmentAnimation();
        if (!cf0Var.b0 && !cf0Var.r0) {
            cf0Var.b0 = true;
            cf0Var.r0 = true;
            cf0Var.j0(false);
        }
        cf0Var.o0(true);
    }

    public static void b0(cf0 cf0Var) {
        if (cf0Var.f != org.telegram.messenger.p10.i(cf0Var.getAccountInstance().a).n) {
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
        org.telegram.messenger.g0.b4(cf0Var.b);
        cf0Var.getConnectionsManager().bindRequestToGuid(sendRequest, cf0Var.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749139, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 15));
        k0 k0Var = new k0(15, context, this);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.b.setLayoutManager(b0Var);
        org.telegram.ui.Components.pj0 pj0Var2 = this.b;
        bf0 bf0Var = new bf0(this, context);
        this.a = bf0Var;
        pj0Var2.setAdapter(bf0Var);
        this.b.setOnScrollListener(new ai.o0(7, this, b0Var));
        this.h0 = new org.telegram.ui.Components.si0(this.b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        this.b.setOnItemClickListener(new di.p4(19, this, context));
        this.b.setOnItemLongClickListener(new pe0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.y1 && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var == null || q4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.pj0 pj0Var = this.b;
        if (pj0Var != null) {
            int childCount = pj0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.b.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.q70) {
                    ((org.telegram.ui.Components.q70) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.m50 m50Var = this.l0;
        if (m50Var != null) {
            m50Var.updateColors();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        boolean z10 = this.d0;
        long j3 = this.n;
        if (!z10 || this.e0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(j10);
            }
            boolean z11 = this.r0;
            if (z11) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList2)).date;
                }
            }
            this.W = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new bi.u9(this, this.o0 ? null : this.e, z11, 7)), getClassGuid());
        } else {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().j1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new me0(this, 0)), getClassGuid());
        }
        if (z9) {
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
        ue0Var.c = this.D;
        ue0Var.d = this.E;
        ue0Var.e = this.H;
        ue0Var.f = this.I;
        ue0Var.g = this.U;
        ue0Var.h = this.V;
        ue0Var.b = this.X;
        ue0Var.k.clear();
        ue0Var.k.addAll(this.i0);
        ue0Var.l.clear();
        ue0Var.l.addAll(this.j0);
        return ue0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.o0 = org.telegram.messenger.t3.t0(this.c);
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
        org.telegram.messenger.g0.b4(this.b);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z9) {
        bf0 bf0Var;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(this.n));
        this.c = M0;
        if (M0 == null) {
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
        boolean z10 = this.f != org.telegram.messenger.p10.i(getAccountInstance().a).n;
        if (z10) {
            int i7 = this.X;
            this.Q = i7;
            this.X = i7 + 2;
            this.R = i7 + 1;
        } else {
            int i10 = this.X;
            this.X = i10 + 1;
            this.r = i10;
        }
        int i11 = this.X;
        this.s = i11;
        int i12 = i11 + 2;
        this.X = i12;
        this.w = i11 + 1;
        ArrayList arrayList = this.i0;
        if (!z10) {
            this.x = i12;
            this.X = i11 + 4;
            this.y = i11 + 3;
        } else if (!arrayList.isEmpty()) {
            int i13 = this.X;
            this.x = i13;
            this.X = i13 + 2;
            this.P = i13 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i14 = this.X;
            this.D = i14;
            int size = arrayList.size() + i14;
            this.X = size;
            this.E = size;
        }
        if (!z10 && arrayList.isEmpty() && this.y >= 0 && (!this.W || this.d0 || this.r0)) {
            int i15 = this.X;
            this.X = i15 + 1;
            this.O = i15;
        }
        if (!z10) {
            ArrayList arrayList2 = this.m0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.y >= 0) && this.O == -1) {
                    int i16 = this.X;
                    this.X = i16 + 1;
                    this.T = i16;
                }
                int i17 = this.X;
                int i18 = i17 + 1;
                this.X = i18;
                this.S = i17;
                this.U = i18;
                int size2 = arrayList2.size() + i18;
                this.X = size2;
                this.V = size2;
            }
        }
        ArrayList arrayList3 = this.j0;
        if (!arrayList3.isEmpty()) {
            if (this.U >= 0) {
                int i19 = this.X;
                this.X = i19 + 1;
                this.J = i19;
            } else if ((!arrayList.isEmpty() || this.y >= 0) && this.O == -1) {
                int i20 = this.X;
                this.X = i20 + 1;
                this.J = i20;
            } else if (z10 && this.D == -1) {
                int i21 = this.X;
                this.X = i21 + 1;
                this.J = i21;
            }
            int i22 = this.X;
            int i23 = i22 + 1;
            this.X = i23;
            this.L = i22;
            this.H = i23;
            int size3 = arrayList3.size() + i23;
            this.I = size3;
            this.M = size3;
            this.X = size3 + 2;
            this.N = size3 + 1;
        }
        if (!this.d0 && !this.r0 && ((this.W || this.b0) && !z10)) {
            int i24 = this.X;
            this.X = i24 + 1;
            this.F = i24;
        }
        if (!arrayList.isEmpty()) {
            int i25 = this.E;
            int i26 = this.X;
            if (i25 == i26) {
                this.X = i26 + 1;
                this.G = i26;
                bf0Var = this.a;
                if (bf0Var == null && z9) {
                    bf0Var.f();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i27 = this.X;
            this.X = i27 + 1;
            this.K = i27;
        }
        bf0Var = this.a;
        if (bf0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        bf0 bf0Var = this.a;
        if (bf0Var != null) {
            bf0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.Components.m50 m50Var;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9) {
            this.g0 = true;
            if (z10 && (m50Var = this.l0) != null && m50Var.c2) {
                m50Var.show();
            }
        }
        this.t0.e();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        this.t0.d();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
