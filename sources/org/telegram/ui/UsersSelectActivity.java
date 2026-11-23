package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, View.OnClickListener {
    public int E;
    public org.telegram.ui.Components.e5 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public a0.h P;
    public ArrayList Q;
    public org.telegram.ui.Components.p20 R;
    public int S;
    public int T;
    public org.telegram.ui.ActionBar.l1 a;
    public nb1 b;
    public ah.i c;
    public org.telegram.ui.Components.ek0 d;
    public org.telegram.ui.Components.yz e;
    public org.telegram.ui.Components.d60 f;
    public mb1 h;
    public kb1 n;
    public org.telegram.ui.Components.c10 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public int y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z10) {
        super(null);
        this.P = new a0.h();
        this.Q = new ArrayList();
        this.K = z10;
        this.L = i7;
        this.M = arrayList;
        this.y = 0;
        this.H = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(UsersSelectActivity usersSelectActivity, Context context, View view, int i7) {
        long j3;
        org.telegram.ui.Components.op opVar;
        a0.h hVar = usersSelectActivity.P;
        if (view instanceof org.telegram.ui.Cells.i4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            Object object = i4Var.getObject();
            boolean z10 = object instanceof String;
            if (z10) {
                j3 = -9223372036854775807L;
                int i10 = 8;
                if (usersSelectActivity.y == 2) {
                    if (i7 == 1) {
                        j3 = -9223372036854775800L;
                        i10 = 1;
                    } else if (i7 == 2 && !usersSelectActivity.J) {
                        j3 = -9223372036854775799L;
                        i10 = 2;
                    } else if (i7 == (!usersSelectActivity.J ? 1 : 0) + 2) {
                        j3 = Long.MIN_VALUE;
                        i10 = 4;
                    }
                    opVar = i4Var.d;
                    if (opVar == null ? opVar.a.q : i4Var.I) {
                        usersSelectActivity.L |= i10;
                    } else {
                        usersSelectActivity.L &= ~i10;
                    }
                } else {
                    if (usersSelectActivity.K) {
                        if (i7 == 1) {
                            int i11 = org.telegram.messenger.np.I8;
                            i10 = 1;
                            j3 = Long.MIN_VALUE;
                        } else if (i7 == 2) {
                            int i12 = org.telegram.messenger.np.I8;
                            i10 = 2;
                        } else if (i7 == 3) {
                            int i13 = org.telegram.messenger.np.I8;
                            j3 = -9223372036854775806L;
                            i10 = 4;
                        } else if (i7 == 4) {
                            int i14 = org.telegram.messenger.np.I8;
                            j3 = -9223372036854775805L;
                        } else {
                            int i15 = org.telegram.messenger.np.I8;
                            i10 = 16;
                            j3 = -9223372036854775804L;
                        }
                    } else if (i7 == 1) {
                        int i16 = org.telegram.messenger.np.I8;
                        i10 = 32;
                        j3 = -9223372036854775803L;
                    } else if (i7 == 2) {
                        int i17 = org.telegram.messenger.np.I8;
                        i10 = 64;
                        j3 = -9223372036854775802L;
                    } else {
                        int i18 = org.telegram.messenger.np.I8;
                        i10 = 128;
                        j3 = -9223372036854775801L;
                    }
                    opVar = i4Var.d;
                    if (opVar == null ? opVar.a.q : i4Var.I) {
                    }
                }
            } else if (object instanceof TLRPC.User) {
                j3 = ((TLRPC.User) object).id;
            } else {
                if (!(object instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j3 = -chat.id;
                if (usersSelectActivity.y == 1 && !org.telegram.messenger.v3.y(13, chat)) {
                    org.telegram.messenger.f3.o(null, 2131748106, org.telegram.ui.Components.lc.b0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j3) >= 0;
            if (z11) {
                usersSelectActivity.b.b((org.telegram.ui.Components.p20) hVar.f(j3));
            } else if ((!z10 && !usersSelectActivity.getUserConfig().q() && usersSelectActivity.x >= org.telegram.messenger.np.u1(usersSelectActivity.currentAccount).Q4) || usersSelectActivity.x >= org.telegram.messenger.np.u1(usersSelectActivity.currentAccount).R4) {
                ug.k0 k0Var = new ug.k0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                k0Var.s2 = usersSelectActivity.x;
                usersSelectActivity.showDialog(k0Var);
                return;
            } else {
                if (object instanceof TLRPC.User) {
                    org.telegram.messenger.np.u1(usersSelectActivity.currentAccount).e4((TLRPC.User) object, !usersSelectActivity.O, false);
                } else if (object instanceof TLRPC.Chat) {
                    org.telegram.messenger.np.u1(usersSelectActivity.currentAccount).X3((TLRPC.Chat) object, !usersSelectActivity.O);
                }
                org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(usersSelectActivity.c.getContext(), object);
                usersSelectActivity.b.a(p20Var, true);
                p20Var.setOnClickListener(usersSelectActivity);
            }
            usersSelectActivity.d0();
            if (usersSelectActivity.O || usersSelectActivity.N) {
                org.telegram.messenger.g0.I3(usersSelectActivity.c);
            } else {
                i4Var.c(!z11, true);
            }
            if (usersSelectActivity.c.length() > 0) {
                usersSelectActivity.c.setText((CharSequence) null);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r4.equals("existing_chats") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r4.equals("new_chats") != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        long j3;
        int childCount = this.d.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.d.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                Object object = i4Var.getObject();
                if (object instanceof String) {
                    String str = (String) object;
                    j3 = -9223372036854775800L;
                    switch (str.hashCode()) {
                        case -1716307998:
                            str.equals("archived");
                            j3 = -9223372036854775801L;
                            break;
                        case -1237460524:
                            if (str.equals("groups")) {
                                j3 = -9223372036854775806L;
                                break;
                            }
                            j3 = -9223372036854775801L;
                            break;
                        case -1197490811:
                            if (str.equals("non_contacts")) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            j3 = -9223372036854775801L;
                            break;
                        case -567451565:
                            if (str.equals("contacts")) {
                                j3 = Long.MIN_VALUE;
                                break;
                            }
                            j3 = -9223372036854775801L;
                            break;
                        case -268161860:
                            break;
                        case 3029900:
                            if (str.equals("bots")) {
                                j3 = -9223372036854775804L;
                                break;
                            }
                            j3 = -9223372036854775801L;
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                j3 = -9223372036854775802L;
                                break;
                            }
                            j3 = -9223372036854775801L;
                            break;
                        case 104264043:
                            if (str.equals("muted")) {
                                j3 = -9223372036854775803L;
                                break;
                            }
                            j3 = -9223372036854775801L;
                            break;
                        case 151051367:
                            break;
                        case 1432626128:
                            if (str.equals("channels")) {
                                j3 = -9223372036854775805L;
                                break;
                            }
                            j3 = -9223372036854775801L;
                            break;
                        default:
                            j3 = -9223372036854775801L;
                            break;
                    }
                } else {
                    j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                if (j3 != 0) {
                    i4Var.c(this.P.h(j3) >= 0, true);
                    i4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void c0() {
        a0.h hVar = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < hVar.m(); i7++) {
            if (hVar.j(i7) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i7)));
            }
        }
        kb1 kb1Var = this.n;
        if (kb1Var != null) {
            kb1Var.c(this.L, arrayList);
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7;
        final int i10 = 0;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        org.telegram.ui.ActionBar.h6 h6Var = null;
        this.R = null;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(parentActivity);
            e5Var.a = true;
            e5Var.b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            e5Var.c = o6Var;
            int i11 = org.telegram.ui.ActionBar.m6.A8;
            org.telegram.ui.ActionBar.t6.Y(o6Var, i11, null);
            o6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            o6Var.setGravity(3);
            o6Var.setTypeface(org.telegram.messenger.g0.o());
            o6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            e5Var.addView(o6Var);
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            e5Var.d = o6Var2;
            o6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
            org.telegram.ui.ActionBar.t6.Y(o6Var2, i11, null);
            o6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            o6Var2.setGravity(3);
            o6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            e5Var.addView(o6Var2);
            o6Var.getDrawable().K = true;
            o6Var2.getDrawable().K = true;
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
            o6Var.b(1.0f, 150L, nrVar);
            o6Var2.b(1.0f, 150L, nrVar);
            e5Var.setClipChildren(false);
            this.F = e5Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = org.telegram.messenger.hd.a0;
            kVar.addView(e5Var, c8.ma.d(-1, -1.0f, 0, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i12 = this.y;
        boolean z11 = this.K;
        int i13 = 2;
        if (i12 == 0 || i12 == 2) {
            if (z11) {
                this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131750793, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131750717, null));
            }
        } else if (i12 == 1) {
            d0();
        }
        int i14 = 22;
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, i14));
        e eVar = new e(i13, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this, context, 5);
        this.a = l1Var;
        l1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.x3(this.a, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
        eVar.addView(this.a);
        nb1 nb1Var = new nb1(this, context);
        this.b = nb1Var;
        this.a.addView(nb1Var, c8.ma.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jb1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        org.telegram.messenger.g0.I3(usersSelectActivity.c);
                        break;
                    default:
                        this.b.c0();
                        break;
                }
            }
        });
        ah.i iVar = new ah.i(10, context, this);
        this.c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.A(this.c, org.telegram.ui.ActionBar.m6.Oi, null);
        org.telegram.ui.ActionBar.t6.U(this.c, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.v(this.c, org.telegram.ui.ActionBar.m6.Pi, null);
        this.c.setCursorWidth(1.5f);
        ah.i iVar2 = this.c;
        iVar2.setInputType(iVar2.getInputType() | org.telegram.messenger.ls.G2);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        this.c.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(org.telegram.messenger.hd.N0(2131745572, null));
        this.c.setCustomSelectionActionModeCallback(new oi.z0(4));
        final int i15 = 1;
        this.c.setOnKeyListener(new s40(i15, this));
        this.c.addTextChangedListener(new m0(this, 19));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.e = yzVar;
        yzVar.setViewType(10);
        org.telegram.ui.Components.yz yzVar2 = this.e;
        yzVar2.x = false;
        yzVar2.setItemsCount(3);
        org.telegram.ui.Components.yz yzVar3 = this.e;
        int i16 = org.telegram.ui.ActionBar.m6.G8;
        int i17 = org.telegram.ui.ActionBar.m6.i6;
        yzVar3.e(i16, i17, i17);
        eVar.addView(this.e);
        org.telegram.ui.Components.d60 d60Var = new org.telegram.ui.Components.d60(context, this.e, 1, h6Var, 2);
        this.f = d60Var;
        d60Var.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f.d.setText(org.telegram.messenger.hd.N0(2131748030, null));
        eVar.addView(this.f);
        v4.c0 c0Var = new v4.c0(1, false);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.d = ek0Var;
        ek0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.ek0 ek0Var2 = this.d;
        mb1 mb1Var = new mb1(this, context);
        this.h = mb1Var;
        ek0Var2.setAdapter(mb1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        this.d.i(new fi.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new fi.g4(i14, this, context));
        this.d.setOnScrollListener(new d21(this, 6));
        this.s = org.telegram.ui.Components.c10.b();
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
        this.r = c10Var;
        c10Var.setImageResource(R.drawable.floating_check);
        eVar.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jb1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        org.telegram.messenger.g0.I3(usersSelectActivity.c);
                        break;
                    default:
                        this.b.c0();
                        break;
                }
            }
        });
        this.r.setContentDescription(org.telegram.messenger.hd.N0(2131748057, null));
        int i18 = z11 ? 5 : 3;
        for (int i19 = 1; i19 <= i18; i19++) {
            String str = "non_contacts";
            if (this.y == 2) {
                if (i19 == 1) {
                    str = "existing_chats";
                    i7 = 1;
                } else if (i19 != 2 || this.J) {
                    if (i19 == (!this.J ? 1 : 0) + 2) {
                        str = "contacts";
                        i7 = 4;
                    }
                    i7 = 8;
                } else {
                    str = "new_chats";
                    i7 = 2;
                }
            } else if (z11) {
                if (i19 == 1) {
                    int i20 = org.telegram.messenger.np.I8;
                    i7 = 1;
                    str = "contacts";
                } else if (i19 == 2) {
                    int i21 = org.telegram.messenger.np.I8;
                    i7 = 2;
                } else if (i19 == 3) {
                    int i22 = org.telegram.messenger.np.I8;
                    str = "groups";
                    i7 = 4;
                } else if (i19 == 4) {
                    int i23 = org.telegram.messenger.np.I8;
                    str = "channels";
                    i7 = 8;
                } else {
                    int i24 = org.telegram.messenger.np.I8;
                    str = "bots";
                    i7 = 16;
                }
            } else if (i19 == 1) {
                int i25 = org.telegram.messenger.np.I8;
                str = "muted";
                i7 = 32;
            } else if (i19 == 2) {
                int i26 = org.telegram.messenger.np.I8;
                str = "read";
                i7 = 64;
            } else {
                int i27 = org.telegram.messenger.np.I8;
                str = "archived";
                i7 = 128;
            }
            if ((i7 & this.L) != 0) {
                org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(this.c.getContext(), str);
                this.b.a(p20Var, false);
                p20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i28 = 0; i28 < size; i28++) {
                Long l10 = (Long) arrayList.get(i28);
                Object c22 = l10.longValue() > 0 ? getMessagesController().c2(l10) : getMessagesController().O0(Long.valueOf(-l10.longValue()));
                if (c22 != null) {
                    org.telegram.ui.Components.p20 p20Var2 = new org.telegram.ui.Components.p20(this.c.getContext(), c22);
                    this.b.a(p20Var2, false);
                    p20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7 = this.y;
        if (i7 == 0) {
            int i10 = getUserConfig().q() ? getMessagesController().R4 : getMessagesController().Q4;
            int i11 = this.x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.hd.a0("MembersCountZero", null, 2131748426, org.telegram.messenger.hd.G(i10, "Chats", new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.hd.K0(i11, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(i10)));
                return;
            }
        }
        if (i7 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.x == 0) {
                this.F.getTitle().c(org.telegram.messenger.hd.N0(2131745472, null), true, true);
                if (this.T > 0) {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.hd.N0(2131745471, null), true, true);
                    return;
                } else {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.hd.N0(2131745469, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.o6 title = this.F.getTitle();
            int i12 = this.x;
            title.setText(org.telegram.messenger.hd.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.T > 0) {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.hd.N0(2131745470, null));
            } else {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.hd.N0(2131745468, null));
            }
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.O) {
            org.telegram.ui.Components.d60 d60Var = this.f;
            if (d60Var != null) {
                d60Var.e(false, true);
            }
            mb1 mb1Var = this.h;
            if (mb1Var != null) {
                mb1Var.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ls.r) {
            if (i7 == org.telegram.messenger.ls.R) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            int i11 = org.telegram.messenger.np.I8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.d.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.i4) {
                    ((org.telegram.ui.Cells.i4) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ui));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) view;
        if (!p20Var.E) {
            org.telegram.ui.Components.p20 p20Var2 = this.R;
            if (p20Var2 != null) {
                p20Var2.a();
            }
            this.R = p20Var;
            p20Var.b();
            return;
        }
        this.R = null;
        this.b.b(p20Var);
        if (this.y == 2) {
            if (p20Var.getUid() == -9223372036854775800L) {
                this.L &= -2;
            } else if (p20Var.getUid() == -9223372036854775799L) {
                this.L &= -3;
            } else if (p20Var.getUid() == Long.MIN_VALUE) {
                this.L &= -5;
            } else if (p20Var.getUid() == -9223372036854775807L) {
                this.L &= -9;
            }
        } else if (p20Var.getUid() == Long.MIN_VALUE) {
            int i7 = this.L;
            int i10 = org.telegram.messenger.np.I8;
            this.L = i7 & (-2);
        } else if (p20Var.getUid() == -9223372036854775807L) {
            int i11 = this.L;
            int i12 = org.telegram.messenger.np.I8;
            this.L = i11 & (-3);
        } else if (p20Var.getUid() == -9223372036854775806L) {
            int i13 = this.L;
            int i14 = org.telegram.messenger.np.I8;
            this.L = i13 & (-5);
        } else if (p20Var.getUid() == -9223372036854775805L) {
            int i15 = this.L;
            int i16 = org.telegram.messenger.np.I8;
            this.L = i15 & (-9);
        } else if (p20Var.getUid() == -9223372036854775804L) {
            int i17 = this.L;
            int i18 = org.telegram.messenger.np.I8;
            this.L = i17 & (-17);
        } else if (p20Var.getUid() == -9223372036854775803L) {
            int i19 = this.L;
            int i20 = org.telegram.messenger.np.I8;
            this.L = i19 & (-33);
        } else if (p20Var.getUid() == -9223372036854775802L) {
            int i21 = this.L;
            int i22 = org.telegram.messenger.np.I8;
            this.L = i21 & (-65);
        } else if (p20Var.getUid() == -9223372036854775801L) {
            int i23 = this.L;
            int i24 = org.telegram.messenger.np.I8;
            this.L = i23 & (-129);
        }
        d0();
        b0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.O);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.r);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.R);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.O);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.r);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.R);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.t6.l(iVar, 34, org.telegram.ui.ActionBar.m6.Oi, null);
                org.telegram.ui.ActionBar.t6.v(this.c, org.telegram.ui.ActionBar.m6.Pi, null);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.d;
            if (ek0Var != null) {
                ek0Var.x1();
            }
            org.telegram.ui.ActionBar.l1 l1Var = this.a;
            if (l1Var != null) {
                org.telegram.messenger.g0.x3(l1Var, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
            }
            if (this.b != null) {
                for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                    View childAt = this.b.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.p20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setContainerHeight(int i7) {
        this.E = i7;
        nb1 nb1Var = this.b;
        if (nb1Var != null) {
            nb1Var.requestLayout();
        }
    }
}
