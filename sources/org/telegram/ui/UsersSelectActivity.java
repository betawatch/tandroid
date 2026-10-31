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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, View.OnClickListener {
    public int D;
    public org.telegram.ui.Components.u4 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public int J;
    public final ArrayList K;
    public boolean L;
    public boolean M;
    public a0.h N;
    public ArrayList O;
    public org.telegram.ui.Components.s20 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.p1 a;
    public gd1 b;
    public org.telegram.ui.ActionBar.n0 c;
    public org.telegram.ui.Components.tk0 d;
    public org.telegram.ui.Components.zz e;
    public org.telegram.ui.Components.f60 f;
    public fd1 h;
    public dd1 n;
    public org.telegram.ui.Components.f10 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public int y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.h();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.y = 0;
        this.G = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(UsersSelectActivity usersSelectActivity, Context context, View view, int i10) {
        long j10;
        org.telegram.ui.Components.ep epVar;
        a0.h hVar = usersSelectActivity.N;
        if (view instanceof org.telegram.ui.Cells.j4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            Object object = j4Var.getObject();
            boolean z10 = object instanceof String;
            if (z10) {
                j10 = -9223372036854775807L;
                int i11 = 8;
                if (usersSelectActivity.y == 2) {
                    if (i10 == 1) {
                        j10 = -9223372036854775800L;
                        i11 = 1;
                    } else if (i10 == 2 && !usersSelectActivity.H) {
                        j10 = -9223372036854775799L;
                        i11 = 2;
                    } else if (i10 == (!usersSelectActivity.H ? 1 : 0) + 2) {
                        j10 = Long.MIN_VALUE;
                        i11 = 4;
                    }
                    epVar = j4Var.d;
                    if (epVar == null ? epVar.a.q : j4Var.H) {
                        usersSelectActivity.J |= i11;
                    } else {
                        usersSelectActivity.J &= ~i11;
                    }
                } else {
                    if (usersSelectActivity.I) {
                        if (i10 == 1) {
                            int i12 = org.telegram.messenger.vp.D8;
                            i11 = 1;
                            j10 = Long.MIN_VALUE;
                        } else if (i10 == 2) {
                            int i13 = org.telegram.messenger.vp.D8;
                            i11 = 2;
                        } else if (i10 == 3) {
                            int i14 = org.telegram.messenger.vp.D8;
                            j10 = -9223372036854775806L;
                            i11 = 4;
                        } else if (i10 == 4) {
                            int i15 = org.telegram.messenger.vp.D8;
                            j10 = -9223372036854775805L;
                        } else {
                            int i16 = org.telegram.messenger.vp.D8;
                            i11 = 16;
                            j10 = -9223372036854775804L;
                        }
                    } else if (i10 == 1) {
                        int i17 = org.telegram.messenger.vp.D8;
                        i11 = 32;
                        j10 = -9223372036854775803L;
                    } else if (i10 == 2) {
                        int i18 = org.telegram.messenger.vp.D8;
                        i11 = 64;
                        j10 = -9223372036854775802L;
                    } else {
                        int i19 = org.telegram.messenger.vp.D8;
                        i11 = 128;
                        j10 = -9223372036854775801L;
                    }
                    epVar = j4Var.d;
                    if (epVar == null ? epVar.a.q : j4Var.H) {
                    }
                }
            } else if (object instanceof TLRPC.User) {
                j10 = ((TLRPC.User) object).id;
            } else {
                if (!(object instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j10 = -chat.id;
                if (usersSelectActivity.y == 1 && !org.telegram.messenger.w3.y(13, chat)) {
                    org.telegram.messenger.m5.o(null, 2131748313, org.telegram.ui.Components.cc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j10) >= 0;
            if (z11) {
                usersSelectActivity.b.b((org.telegram.ui.Components.s20) hVar.f(j10));
            } else if ((!z10 && !usersSelectActivity.getUserConfig().q() && usersSelectActivity.x >= org.telegram.messenger.vp.r1(usersSelectActivity.currentAccount).O4) || usersSelectActivity.x >= org.telegram.messenger.vp.r1(usersSelectActivity.currentAccount).P4) {
                kg.q0 q0Var = new kg.q0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                q0Var.o2 = usersSelectActivity.x;
                usersSelectActivity.showDialog(q0Var);
                return;
            } else {
                if (object instanceof TLRPC.User) {
                    org.telegram.messenger.vp.r1(usersSelectActivity.currentAccount).U3((TLRPC.User) object, !usersSelectActivity.M, false);
                } else if (object instanceof TLRPC.Chat) {
                    org.telegram.messenger.vp.r1(usersSelectActivity.currentAccount).N3((TLRPC.Chat) object, !usersSelectActivity.M);
                }
                org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(usersSelectActivity.c.getContext(), object);
                usersSelectActivity.b.a(s20Var, true);
                s20Var.setOnClickListener(usersSelectActivity);
            }
            usersSelectActivity.c0();
            if (usersSelectActivity.M || usersSelectActivity.L) {
                org.telegram.messenger.i0.J3(usersSelectActivity.c);
            } else {
                j4Var.c(!z11, true);
            }
            if (usersSelectActivity.c.length() > 0) {
                usersSelectActivity.c.setText((CharSequence) null);
            }
        }
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
    public final void a0() {
        long j10;
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) childAt;
                Object object = j4Var.getObject();
                if (object instanceof String) {
                    String str = (String) object;
                    j10 = -9223372036854775800L;
                    switch (str.hashCode()) {
                        case -1716307998:
                            str.equals("archived");
                            j10 = -9223372036854775801L;
                            break;
                        case -1237460524:
                            if (str.equals("groups")) {
                                j10 = -9223372036854775806L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -1197490811:
                            if (str.equals("non_contacts")) {
                                j10 = -9223372036854775807L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -567451565:
                            if (str.equals("contacts")) {
                                j10 = Long.MIN_VALUE;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -268161860:
                            break;
                        case 3029900:
                            if (str.equals("bots")) {
                                j10 = -9223372036854775804L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                j10 = -9223372036854775802L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 104264043:
                            if (str.equals("muted")) {
                                j10 = -9223372036854775803L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 151051367:
                            break;
                        case 1432626128:
                            if (str.equals("channels")) {
                                j10 = -9223372036854775805L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        default:
                            j10 = -9223372036854775801L;
                            break;
                    }
                } else {
                    j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                if (j10 != 0) {
                    j4Var.c(this.N.h(j10) >= 0, true);
                    j4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    public final void b0() {
        a0.h hVar = this.N;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        dd1 dd1Var = this.n;
        if (dd1Var != null) {
            dd1Var.e(this.J, arrayList);
        }
        finishFragment();
    }

    public final void c0() {
        int i10 = this.y;
        if (i10 == 0) {
            int i11 = getUserConfig().q() ? getMessagesController().P4 : getMessagesController().O4;
            int i12 = this.x;
            if (i12 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.cd.a0("MembersCountZero", null, 2131748634, org.telegram.messenger.cd.G(i11, "Chats", new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.cd.J0(i12, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(i11)));
                return;
            }
        }
        if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.x == 0) {
                this.E.getTitle().c(org.telegram.messenger.cd.L0(2131745685, null), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.cd.L0(2131745684, null), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.cd.L0(2131745682, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.f6 title = this.E.getTitle();
            int i13 = this.x;
            title.setText(org.telegram.messenger.cd.G(i13, "Chats", Integer.valueOf(i13)));
            if (this.R > 0) {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.cd.L0(2131745683, null));
            } else {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.cd.L0(2131745681, null));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10;
        final int i11 = 0;
        this.M = false;
        this.L = false;
        this.O.clear();
        this.N.b();
        org.telegram.ui.ActionBar.p6 p6Var = null;
        this.P = null;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.u4 u4Var = new org.telegram.ui.Components.u4(parentActivity);
            u4Var.a = true;
            u4Var.b = org.telegram.messenger.i0.L(8.0f);
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(parentActivity, true, true, true);
            u4Var.c = f6Var;
            int i12 = org.telegram.ui.ActionBar.t6.A8;
            org.telegram.ui.ActionBar.a7.Z(f6Var, i12, null);
            f6Var.setTextSize(org.telegram.messenger.i0.L(18.0f));
            f6Var.setGravity(3);
            f6Var.setTypeface(org.telegram.messenger.i0.o());
            f6Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(12.0f));
            u4Var.addView(f6Var);
            org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(parentActivity, true, true, true);
            u4Var.d = f6Var2;
            f6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
            org.telegram.ui.ActionBar.a7.Z(f6Var2, i12, null);
            f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
            f6Var2.setGravity(3);
            f6Var2.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
            u4Var.addView(f6Var2);
            f6Var.getDrawable().J = true;
            f6Var2.getDrawable().J = true;
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            f6Var.b(1.0f, 150L, grVar);
            f6Var2.b(1.0f, 150L, grVar);
            u4Var.setClipChildren(false);
            this.E = u4Var;
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            boolean z10 = org.telegram.messenger.cd.X;
            lVar.addView(u4Var, w7.b6.d(-1, -1.0f, 0, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.y;
        boolean z11 = this.I;
        if (i13 == 0 || i13 == 2) {
            if (z11) {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131750806, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131750730, null));
            }
        } else if (i13 == 1) {
            c0();
        }
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 10));
        jf.g gVar = new jf.g(this, context, r12);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(this, context, r12);
        this.a = p1Var;
        p1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.i0.y3(this.a, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        gVar.addView(this.a);
        gd1 gd1Var = new gd1(this, context);
        this.b = gd1Var;
        this.a.addView(gd1Var, w7.b6.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cd1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        org.telegram.messenger.i0.J3(usersSelectActivity.c);
                        break;
                    default:
                        this.b.b0();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 7);
        this.c = n0Var;
        n0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.B(this.c, org.telegram.ui.ActionBar.t6.Li, null);
        org.telegram.ui.ActionBar.a7.V(this.c, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.w(this.c, org.telegram.ui.ActionBar.t6.Mi, null);
        this.c.setCursorWidth(1.5f);
        org.telegram.ui.ActionBar.n0 n0Var2 = this.c;
        n0Var2.setInputType(n0Var2.getInputType() | org.telegram.messenger.zs.G2);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        this.c.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(org.telegram.messenger.cd.L0(2131745785, null));
        this.c.setCustomSelectionActionModeCallback(new bi.i1(4));
        final int i14 = 1;
        this.c.setOnKeyListener(new o50(i14, this));
        this.c.addTextChangedListener(new n0(this, 19));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.e = zzVar;
        zzVar.setViewType(10);
        org.telegram.ui.Components.zz zzVar2 = this.e;
        zzVar2.x = false;
        zzVar2.setItemsCount(3);
        org.telegram.ui.Components.zz zzVar3 = this.e;
        int i15 = org.telegram.ui.ActionBar.t6.G8;
        int i16 = org.telegram.ui.ActionBar.t6.i6;
        zzVar3.e(i15, i16, i16);
        gVar.addView(this.e);
        org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(context, this.e, 1, p6Var, 2);
        this.f = f60Var;
        f60Var.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
        gVar.addView(this.f);
        s4.a0 a0Var = new s4.a0(1, false);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.d = tk0Var;
        tk0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.tk0 tk0Var2 = this.d;
        fd1 fd1Var = new fd1(this, context);
        this.h = fd1Var;
        tk0Var2.setAdapter(fd1Var);
        this.d.setLayoutManager(a0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        this.d.i(new dh.g(12));
        gVar.addView(this.d);
        this.d.setOnItemClickListener(new mg.q0(21, this, context));
        this.d.setOnScrollListener(new w41(this, r12));
        this.s = org.telegram.ui.Components.f10.b();
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.r = f10Var;
        f10Var.setImageResource(R.drawable.floating_check);
        gVar.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cd1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        org.telegram.messenger.i0.J3(usersSelectActivity.c);
                        break;
                    default:
                        this.b.b0();
                        break;
                }
            }
        });
        this.r.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        r12 = z11 ? 5 : 3;
        for (int i17 = 1; i17 <= r12; i17++) {
            String str = "non_contacts";
            if (this.y == 2) {
                if (i17 == 1) {
                    str = "existing_chats";
                    i10 = 1;
                } else if (i17 != 2 || this.H) {
                    if (i17 == (!this.H ? 1 : 0) + 2) {
                        str = "contacts";
                        i10 = 4;
                    }
                    i10 = 8;
                } else {
                    str = "new_chats";
                    i10 = 2;
                }
            } else if (z11) {
                if (i17 == 1) {
                    int i18 = org.telegram.messenger.vp.D8;
                    i10 = 1;
                    str = "contacts";
                } else if (i17 == 2) {
                    int i19 = org.telegram.messenger.vp.D8;
                    i10 = 2;
                } else if (i17 == 3) {
                    int i20 = org.telegram.messenger.vp.D8;
                    str = "groups";
                    i10 = 4;
                } else if (i17 == 4) {
                    int i21 = org.telegram.messenger.vp.D8;
                    str = "channels";
                    i10 = 8;
                } else {
                    int i22 = org.telegram.messenger.vp.D8;
                    str = "bots";
                    i10 = 16;
                }
            } else if (i17 == 1) {
                int i23 = org.telegram.messenger.vp.D8;
                str = "muted";
                i10 = 32;
            } else if (i17 == 2) {
                int i24 = org.telegram.messenger.vp.D8;
                str = "read";
                i10 = 64;
            } else {
                int i25 = org.telegram.messenger.vp.D8;
                str = "archived";
                i10 = 128;
            }
            if ((i10 & this.J) != 0) {
                org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(this.c.getContext(), str);
                this.b.a(s20Var, false);
                s20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.K;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i26 = 0; i26 < size; i26++) {
                Long l4 = (Long) arrayList.get(i26);
                Object Z1 = l4.longValue() > 0 ? getMessagesController().Z1(l4) : getMessagesController().L0(Long.valueOf(-l4.longValue()));
                if (Z1 != null) {
                    org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(this.c.getContext(), Z1);
                    this.b.a(s20Var2, false);
                    s20Var2.setOnClickListener(this);
                }
            }
        }
        c0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.O) {
            org.telegram.ui.Components.f60 f60Var = this.f;
            if (f60Var != null) {
                f60Var.e(false, true);
            }
            fd1 fd1Var = this.h;
            if (fd1Var != null) {
                fd1Var.f();
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.r) {
            if (i10 == org.telegram.messenger.zs.R) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            int i12 = org.telegram.messenger.vp.D8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.d.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.j4) {
                    ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.D;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ri));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        if (!s20Var.D) {
            org.telegram.ui.Components.s20 s20Var2 = this.P;
            if (s20Var2 != null) {
                s20Var2.a();
            }
            this.P = s20Var;
            s20Var.b();
            return;
        }
        this.P = null;
        this.b.b(s20Var);
        if (this.y == 2) {
            if (s20Var.getUid() == -9223372036854775800L) {
                this.J &= -2;
            } else if (s20Var.getUid() == -9223372036854775799L) {
                this.J &= -3;
            } else if (s20Var.getUid() == Long.MIN_VALUE) {
                this.J &= -5;
            } else if (s20Var.getUid() == -9223372036854775807L) {
                this.J &= -9;
            }
        } else if (s20Var.getUid() == Long.MIN_VALUE) {
            int i10 = this.J;
            int i11 = org.telegram.messenger.vp.D8;
            this.J = i10 & (-2);
        } else if (s20Var.getUid() == -9223372036854775807L) {
            int i12 = this.J;
            int i13 = org.telegram.messenger.vp.D8;
            this.J = i12 & (-3);
        } else if (s20Var.getUid() == -9223372036854775806L) {
            int i14 = this.J;
            int i15 = org.telegram.messenger.vp.D8;
            this.J = i14 & (-5);
        } else if (s20Var.getUid() == -9223372036854775805L) {
            int i16 = this.J;
            int i17 = org.telegram.messenger.vp.D8;
            this.J = i16 & (-9);
        } else if (s20Var.getUid() == -9223372036854775804L) {
            int i18 = this.J;
            int i19 = org.telegram.messenger.vp.D8;
            this.J = i18 & (-17);
        } else if (s20Var.getUid() == -9223372036854775803L) {
            int i20 = this.J;
            int i21 = org.telegram.messenger.vp.D8;
            this.J = i20 & (-33);
        } else if (s20Var.getUid() == -9223372036854775802L) {
            int i22 = this.J;
            int i23 = org.telegram.messenger.vp.D8;
            this.J = i22 & (-65);
        } else if (s20Var.getUid() == -9223372036854775801L) {
            int i24 = this.J;
            int i25 = org.telegram.messenger.vp.D8;
            this.J = i24 & (-129);
        }
        c0();
        a0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.O);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.R);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.O);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.R);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.n0 n0Var = this.c;
        if (n0Var != null) {
            n0Var.requestFocus();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.n0 n0Var = this.c;
            if (n0Var != null) {
                org.telegram.ui.ActionBar.a7.m(n0Var, 34, org.telegram.ui.ActionBar.t6.Li, null);
                org.telegram.ui.ActionBar.a7.w(this.c, org.telegram.ui.ActionBar.t6.Mi, null);
            }
            org.telegram.ui.Components.tk0 tk0Var = this.d;
            if (tk0Var != null) {
                tk0Var.x1();
            }
            org.telegram.ui.ActionBar.p1 p1Var = this.a;
            if (p1Var != null) {
                org.telegram.messenger.i0.y3(p1Var, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            }
            if (this.b != null) {
                for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
                    View childAt = this.b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.s20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public void setContainerHeight(int i10) {
        this.D = i10;
        gd1 gd1Var = this.b;
        if (gd1Var != null) {
            gd1Var.requestLayout();
        }
    }
}
