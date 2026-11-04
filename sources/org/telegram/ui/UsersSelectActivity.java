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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, View.OnClickListener {
    public int E;
    public org.telegram.ui.Components.v4 F;
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
    public org.telegram.ui.Components.y10 R;
    public int S;
    public int T;
    public org.telegram.ui.ActionBar.k1 a;
    public db1 b;
    public bh.g c;
    public org.telegram.ui.Components.tj0 d;
    public org.telegram.ui.Components.iz e;
    public org.telegram.ui.Components.m50 f;
    public cb1 h;
    public ab1 n;
    public org.telegram.ui.Components.l00 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public int y;

    public UsersSelectActivity(int i3, ArrayList arrayList, boolean z10) {
        super(null);
        this.P = new a0.h();
        this.Q = new ArrayList();
        this.K = z10;
        this.L = i3;
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
    public static void Z(UsersSelectActivity usersSelectActivity, Context context, View view, int i3) {
        long j10;
        org.telegram.ui.Components.wo woVar;
        a0.h hVar = usersSelectActivity.P;
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            boolean z10 = object instanceof String;
            if (z10) {
                j10 = -9223372036854775807L;
                int i10 = 8;
                if (usersSelectActivity.y == 2) {
                    if (i3 == 1) {
                        j10 = -9223372036854775800L;
                        i10 = 1;
                    } else if (i3 == 2 && !usersSelectActivity.J) {
                        j10 = -9223372036854775799L;
                        i10 = 2;
                    } else if (i3 == (!usersSelectActivity.J ? 1 : 0) + 2) {
                        j10 = Long.MIN_VALUE;
                        i10 = 4;
                    }
                    woVar = h4Var.d;
                    if (woVar == null ? woVar.a.q : h4Var.I) {
                        usersSelectActivity.L |= i10;
                    } else {
                        usersSelectActivity.L &= ~i10;
                    }
                } else {
                    if (usersSelectActivity.K) {
                        if (i3 == 1) {
                            int i11 = org.telegram.messenger.hp.C8;
                            i10 = 1;
                            j10 = Long.MIN_VALUE;
                        } else if (i3 == 2) {
                            int i12 = org.telegram.messenger.hp.C8;
                            i10 = 2;
                        } else if (i3 == 3) {
                            int i13 = org.telegram.messenger.hp.C8;
                            j10 = -9223372036854775806L;
                            i10 = 4;
                        } else if (i3 == 4) {
                            int i14 = org.telegram.messenger.hp.C8;
                            j10 = -9223372036854775805L;
                        } else {
                            int i15 = org.telegram.messenger.hp.C8;
                            i10 = 16;
                            j10 = -9223372036854775804L;
                        }
                    } else if (i3 == 1) {
                        int i16 = org.telegram.messenger.hp.C8;
                        i10 = 32;
                        j10 = -9223372036854775803L;
                    } else if (i3 == 2) {
                        int i17 = org.telegram.messenger.hp.C8;
                        i10 = 64;
                        j10 = -9223372036854775802L;
                    } else {
                        int i18 = org.telegram.messenger.hp.C8;
                        i10 = 128;
                        j10 = -9223372036854775801L;
                    }
                    woVar = h4Var.d;
                    if (woVar == null ? woVar.a.q : h4Var.I) {
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
                if (usersSelectActivity.y == 1 && !org.telegram.messenger.t3.y(13, chat)) {
                    org.telegram.messenger.k5.p(null, 2131748307, org.telegram.ui.Components.fc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j10) >= 0;
            if (z11) {
                usersSelectActivity.b.b((org.telegram.ui.Components.y10) hVar.f(j10));
            } else if ((!z10 && !usersSelectActivity.getUserConfig().q() && usersSelectActivity.x >= org.telegram.messenger.hp.s1(usersSelectActivity.currentAccount).N4) || usersSelectActivity.x >= org.telegram.messenger.hp.s1(usersSelectActivity.currentAccount).O4) {
                vg.i0 i0Var = new vg.i0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                i0Var.p2 = usersSelectActivity.x;
                usersSelectActivity.showDialog(i0Var);
                return;
            } else {
                if (object instanceof TLRPC.User) {
                    org.telegram.messenger.hp.s1(usersSelectActivity.currentAccount).X3((TLRPC.User) object, !usersSelectActivity.O, false);
                } else if (object instanceof TLRPC.Chat) {
                    org.telegram.messenger.hp.s1(usersSelectActivity.currentAccount).Q3((TLRPC.Chat) object, !usersSelectActivity.O);
                }
                org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(usersSelectActivity.c.getContext(), object);
                usersSelectActivity.b.a(y10Var, true);
                y10Var.setOnClickListener(usersSelectActivity);
            }
            usersSelectActivity.d0();
            if (usersSelectActivity.O || usersSelectActivity.N) {
                org.telegram.messenger.g0.K3(usersSelectActivity.c);
            } else {
                h4Var.c(!z11, true);
            }
            if (usersSelectActivity.c.length() > 0) {
                usersSelectActivity.c.setText((CharSequence) null);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
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
        long j10;
        int childCount = this.d.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.d.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
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
                    h4Var.c(this.P.h(j10) >= 0, true);
                    h4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void c0() {
        a0.h hVar = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < hVar.m(); i3++) {
            if (hVar.j(i3) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i3)));
            }
        }
        ab1 ab1Var = this.n;
        if (ab1Var != null) {
            ab1Var.e(this.L, arrayList);
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3;
        final int i10 = 0;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        org.telegram.ui.ActionBar.e6 e6Var = null;
        this.R = null;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.v4 v4Var = new org.telegram.ui.Components.v4(parentActivity);
            v4Var.a = true;
            v4Var.b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(parentActivity, true, true, true);
            v4Var.c = h6Var;
            int i11 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.r6.Z(h6Var, i11, null);
            h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            h6Var.setGravity(3);
            h6Var.setTypeface(org.telegram.messenger.g0.o());
            h6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            v4Var.addView(h6Var);
            org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(parentActivity, true, true, true);
            v4Var.d = h6Var2;
            h6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
            org.telegram.ui.ActionBar.r6.Z(h6Var2, i11, null);
            h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            h6Var2.setGravity(3);
            h6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            v4Var.addView(h6Var2);
            h6Var.getDrawable().J = true;
            h6Var2.getDrawable().J = true;
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
            h6Var.b(1.0f, 150L, xqVar);
            h6Var2.b(1.0f, 150L, xqVar);
            v4Var.setClipChildren(false);
            this.F = v4Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = org.telegram.messenger.bd.a0;
            kVar.addView(v4Var, b8.mf.d(-1, -1.0f, 0, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i12 = this.y;
        boolean z11 = this.K;
        if (i12 == 0 || i12 == 2) {
            if (z11) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750806, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750730, null));
            }
        } else if (i12 == 1) {
            d0();
        }
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 20));
        e eVar = new e(4, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this, context, 5);
        this.a = k1Var;
        k1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this.a, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        eVar.addView(this.a);
        db1 db1Var = new db1(this, context);
        this.b = db1Var;
        this.a.addView(db1Var, b8.mf.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za1
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
                        org.telegram.messenger.g0.K3(usersSelectActivity.c);
                        break;
                    default:
                        this.b.c0();
                        break;
                }
            }
        });
        bh.g gVar = new bh.g(10, context, this);
        this.c = gVar;
        gVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.B(this.c, org.telegram.ui.ActionBar.k6.Li, null);
        org.telegram.ui.ActionBar.r6.V(this.c, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.w(this.c, org.telegram.ui.ActionBar.k6.Mi, null);
        this.c.setCursorWidth(1.5f);
        bh.g gVar2 = this.c;
        gVar2.setInputType(gVar2.getInputType() | org.telegram.messenger.hs.G2);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        this.c.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(org.telegram.messenger.bd.M0(2131745778, null));
        this.c.setCustomSelectionActionModeCallback(new mi.b1(4));
        final int i13 = 1;
        this.c.setOnKeyListener(new k40(i13, this));
        this.c.addTextChangedListener(new n0(this, 19));
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.e = izVar;
        izVar.setViewType(10);
        org.telegram.ui.Components.iz izVar2 = this.e;
        izVar2.x = false;
        izVar2.setItemsCount(3);
        org.telegram.ui.Components.iz izVar3 = this.e;
        int i14 = org.telegram.ui.ActionBar.k6.G8;
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        izVar3.e(i14, i15, i15);
        eVar.addView(this.e);
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(context, this.e, 1, e6Var, 2);
        this.f = m50Var;
        m50Var.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f.d.setText(org.telegram.messenger.bd.M0(2131748231, null));
        eVar.addView(this.f);
        u4.b0 b0Var = new u4.b0(1, false);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.d = tj0Var;
        tj0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.tj0 tj0Var2 = this.d;
        cb1 cb1Var = new cb1(this, context);
        this.h = cb1Var;
        tj0Var2.setAdapter(cb1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        this.d.i(new ei.l(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new ei.q4(22, this, context));
        this.d.setOnScrollListener(new r11(this, 6));
        this.s = org.telegram.ui.Components.l00.b();
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.r = l00Var;
        l00Var.setImageResource(R.drawable.floating_check);
        eVar.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        org.telegram.messenger.g0.K3(usersSelectActivity.c);
                        break;
                    default:
                        this.b.c0();
                        break;
                }
            }
        });
        this.r.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        int i16 = z11 ? 5 : 3;
        for (int i17 = 1; i17 <= i16; i17++) {
            String str = "non_contacts";
            if (this.y == 2) {
                if (i17 == 1) {
                    str = "existing_chats";
                    i3 = 1;
                } else if (i17 != 2 || this.J) {
                    if (i17 == (!this.J ? 1 : 0) + 2) {
                        str = "contacts";
                        i3 = 4;
                    }
                    i3 = 8;
                } else {
                    str = "new_chats";
                    i3 = 2;
                }
            } else if (z11) {
                if (i17 == 1) {
                    int i18 = org.telegram.messenger.hp.C8;
                    i3 = 1;
                    str = "contacts";
                } else if (i17 == 2) {
                    int i19 = org.telegram.messenger.hp.C8;
                    i3 = 2;
                } else if (i17 == 3) {
                    int i20 = org.telegram.messenger.hp.C8;
                    str = "groups";
                    i3 = 4;
                } else if (i17 == 4) {
                    int i21 = org.telegram.messenger.hp.C8;
                    str = "channels";
                    i3 = 8;
                } else {
                    int i22 = org.telegram.messenger.hp.C8;
                    str = "bots";
                    i3 = 16;
                }
            } else if (i17 == 1) {
                int i23 = org.telegram.messenger.hp.C8;
                str = "muted";
                i3 = 32;
            } else if (i17 == 2) {
                int i24 = org.telegram.messenger.hp.C8;
                str = "read";
                i3 = 64;
            } else {
                int i25 = org.telegram.messenger.hp.C8;
                str = "archived";
                i3 = 128;
            }
            if ((i3 & this.L) != 0) {
                org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(this.c.getContext(), str);
                this.b.a(y10Var, false);
                y10Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i26 = 0; i26 < size; i26++) {
                Long l10 = (Long) arrayList.get(i26);
                Object a22 = l10.longValue() > 0 ? getMessagesController().a2(l10) : getMessagesController().M0(Long.valueOf(-l10.longValue()));
                if (a22 != null) {
                    org.telegram.ui.Components.y10 y10Var2 = new org.telegram.ui.Components.y10(this.c.getContext(), a22);
                    this.b.a(y10Var2, false);
                    y10Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i3 = this.y;
        if (i3 == 0) {
            int i10 = getUserConfig().q() ? getMessagesController().O4 : getMessagesController().N4;
            int i11 = this.x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.bd.a0("MembersCountZero", null, 2131748627, org.telegram.messenger.bd.G(i10, "Chats", new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.bd.K0(i11, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(i10)));
                return;
            }
        }
        if (i3 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.x == 0) {
                this.F.getTitle().c(org.telegram.messenger.bd.M0(2131745678, null), true, true);
                if (this.T > 0) {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.bd.M0(2131745677, null), true, true);
                    return;
                } else {
                    this.F.getSubtitleTextView().c(org.telegram.messenger.bd.M0(2131745675, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.h6 title = this.F.getTitle();
            int i12 = this.x;
            title.setText(org.telegram.messenger.bd.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.T > 0) {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.bd.M0(2131745676, null));
            } else {
                this.F.getSubtitleTextView().setText(org.telegram.messenger.bd.M0(2131745674, null));
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.O) {
            org.telegram.ui.Components.m50 m50Var = this.f;
            if (m50Var != null) {
                m50Var.e(false, true);
            }
            cb1 cb1Var = this.h;
            if (cb1Var != null) {
                cb1Var.f();
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.r) {
            if (i3 == org.telegram.messenger.hs.R) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            int i11 = org.telegram.messenger.hp.C8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.d.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        if (!y10Var.E) {
            org.telegram.ui.Components.y10 y10Var2 = this.R;
            if (y10Var2 != null) {
                y10Var2.a();
            }
            this.R = y10Var;
            y10Var.b();
            return;
        }
        this.R = null;
        this.b.b(y10Var);
        if (this.y == 2) {
            if (y10Var.getUid() == -9223372036854775800L) {
                this.L &= -2;
            } else if (y10Var.getUid() == -9223372036854775799L) {
                this.L &= -3;
            } else if (y10Var.getUid() == Long.MIN_VALUE) {
                this.L &= -5;
            } else if (y10Var.getUid() == -9223372036854775807L) {
                this.L &= -9;
            }
        } else if (y10Var.getUid() == Long.MIN_VALUE) {
            int i3 = this.L;
            int i10 = org.telegram.messenger.hp.C8;
            this.L = i3 & (-2);
        } else if (y10Var.getUid() == -9223372036854775807L) {
            int i11 = this.L;
            int i12 = org.telegram.messenger.hp.C8;
            this.L = i11 & (-3);
        } else if (y10Var.getUid() == -9223372036854775806L) {
            int i13 = this.L;
            int i14 = org.telegram.messenger.hp.C8;
            this.L = i13 & (-5);
        } else if (y10Var.getUid() == -9223372036854775805L) {
            int i15 = this.L;
            int i16 = org.telegram.messenger.hp.C8;
            this.L = i15 & (-9);
        } else if (y10Var.getUid() == -9223372036854775804L) {
            int i17 = this.L;
            int i18 = org.telegram.messenger.hp.C8;
            this.L = i17 & (-17);
        } else if (y10Var.getUid() == -9223372036854775803L) {
            int i19 = this.L;
            int i20 = org.telegram.messenger.hp.C8;
            this.L = i19 & (-33);
        } else if (y10Var.getUid() == -9223372036854775802L) {
            int i21 = this.L;
            int i22 = org.telegram.messenger.hp.C8;
            this.L = i21 & (-65);
        } else if (y10Var.getUid() == -9223372036854775801L) {
            int i23 = this.L;
            int i24 = org.telegram.messenger.hp.C8;
            this.L = i23 & (-129);
        }
        d0();
        b0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.O);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.R);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.O);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.R);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        bh.g gVar = this.c;
        if (gVar != null) {
            gVar.requestFocus();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            bh.g gVar = this.c;
            if (gVar != null) {
                org.telegram.ui.ActionBar.r6.m(gVar, 34, org.telegram.ui.ActionBar.k6.Li, null);
                org.telegram.ui.ActionBar.r6.w(this.c, org.telegram.ui.ActionBar.k6.Mi, null);
            }
            org.telegram.ui.Components.tj0 tj0Var = this.d;
            if (tj0Var != null) {
                tj0Var.x1();
            }
            org.telegram.ui.ActionBar.k1 k1Var = this.a;
            if (k1Var != null) {
                org.telegram.messenger.g0.z3(k1Var, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            }
            if (this.b != null) {
                for (int i3 = 0; i3 < this.b.getChildCount(); i3++) {
                    View childAt = this.b.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Components.y10) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setContainerHeight(int i3) {
        this.E = i3;
        db1 db1Var = this.b;
        if (db1Var != null) {
            db1Var.requestLayout();
        }
    }
}
