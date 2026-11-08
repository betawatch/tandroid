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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, View.OnClickListener {
    public int D;
    public org.telegram.ui.Components.x4 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final boolean J;
    public int K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public a0.h O;
    public ArrayList P;
    public org.telegram.ui.Components.c20 Q;
    public int R;
    public int S;
    public org.telegram.ui.ActionBar.m1 a;
    public lb1 b;
    public ah.i c;
    public org.telegram.ui.Components.pj0 d;
    public org.telegram.ui.Components.mz e;
    public org.telegram.ui.Components.p50 f;
    public kb1 h;
    public ib1 n;
    public org.telegram.ui.Components.q00 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public int y;

    public UsersSelectActivity(int i7, ArrayList arrayList, boolean z9) {
        super(null);
        this.O = new a0.h();
        this.P = new ArrayList();
        this.J = z9;
        this.K = i7;
        this.L = arrayList;
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
    public static void Z(UsersSelectActivity usersSelectActivity, Context context, View view, int i7) {
        long j3;
        org.telegram.ui.Components.wo woVar;
        a0.h hVar = usersSelectActivity.O;
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            boolean z9 = object instanceof String;
            if (z9) {
                j3 = -9223372036854775807L;
                int i10 = 8;
                if (usersSelectActivity.y == 2) {
                    if (i7 == 1) {
                        j3 = -9223372036854775800L;
                        i10 = 1;
                    } else if (i7 == 2 && !usersSelectActivity.I) {
                        j3 = -9223372036854775799L;
                        i10 = 2;
                    } else if (i7 == (!usersSelectActivity.I ? 1 : 0) + 2) {
                        j3 = Long.MIN_VALUE;
                        i10 = 4;
                    }
                    woVar = h4Var.d;
                    if (woVar == null ? woVar.a.q : h4Var.H) {
                        usersSelectActivity.K |= i10;
                    } else {
                        usersSelectActivity.K &= ~i10;
                    }
                } else {
                    if (usersSelectActivity.J) {
                        if (i7 == 1) {
                            int i11 = org.telegram.messenger.qp.C8;
                            i10 = 1;
                            j3 = Long.MIN_VALUE;
                        } else if (i7 == 2) {
                            int i12 = org.telegram.messenger.qp.C8;
                            i10 = 2;
                        } else if (i7 == 3) {
                            int i13 = org.telegram.messenger.qp.C8;
                            j3 = -9223372036854775806L;
                            i10 = 4;
                        } else if (i7 == 4) {
                            int i14 = org.telegram.messenger.qp.C8;
                            j3 = -9223372036854775805L;
                        } else {
                            int i15 = org.telegram.messenger.qp.C8;
                            i10 = 16;
                            j3 = -9223372036854775804L;
                        }
                    } else if (i7 == 1) {
                        int i16 = org.telegram.messenger.qp.C8;
                        i10 = 32;
                        j3 = -9223372036854775803L;
                    } else if (i7 == 2) {
                        int i17 = org.telegram.messenger.qp.C8;
                        i10 = 64;
                        j3 = -9223372036854775802L;
                    } else {
                        int i18 = org.telegram.messenger.qp.C8;
                        i10 = 128;
                        j3 = -9223372036854775801L;
                    }
                    woVar = h4Var.d;
                    if (woVar == null ? woVar.a.q : h4Var.H) {
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
                if (usersSelectActivity.y == 1 && !org.telegram.messenger.t3.y(13, chat)) {
                    org.telegram.messenger.k5.p(null, 2131748300, org.telegram.ui.Components.hc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z10 = hVar.h(j3) >= 0;
            if (z10) {
                usersSelectActivity.b.b((org.telegram.ui.Components.c20) hVar.f(j3));
            } else if ((!z9 && !usersSelectActivity.getUserConfig().q() && usersSelectActivity.x >= org.telegram.messenger.qp.s1(usersSelectActivity.currentAccount).N4) || usersSelectActivity.x >= org.telegram.messenger.qp.s1(usersSelectActivity.currentAccount).O4) {
                ug.i0 i0Var = new ug.i0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                i0Var.o2 = usersSelectActivity.x;
                usersSelectActivity.showDialog(i0Var);
                return;
            } else {
                if (object instanceof TLRPC.User) {
                    org.telegram.messenger.qp.s1(usersSelectActivity.currentAccount).X3((TLRPC.User) object, !usersSelectActivity.N, false);
                } else if (object instanceof TLRPC.Chat) {
                    org.telegram.messenger.qp.s1(usersSelectActivity.currentAccount).Q3((TLRPC.Chat) object, !usersSelectActivity.N);
                }
                org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(usersSelectActivity.c.getContext(), object);
                usersSelectActivity.b.a(c20Var, true);
                c20Var.setOnClickListener(usersSelectActivity);
            }
            usersSelectActivity.d0();
            if (usersSelectActivity.N || usersSelectActivity.M) {
                org.telegram.messenger.g0.K3(usersSelectActivity.c);
            } else {
                h4Var.c(!z10, true);
            }
            if (usersSelectActivity.c.length() > 0) {
                usersSelectActivity.c.setText((CharSequence) null);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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
        long j3;
        int childCount = this.d.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.d.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) childAt;
                Object object = h4Var.getObject();
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
                    h4Var.c(this.O.h(j3) >= 0, true);
                    h4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void c0() {
        a0.h hVar = this.O;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < hVar.m(); i7++) {
            if (hVar.j(i7) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i7)));
            }
        }
        ib1 ib1Var = this.n;
        if (ib1Var != null) {
            ib1Var.c(this.K, arrayList);
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7;
        final int i10 = 0;
        this.N = false;
        this.M = false;
        this.P.clear();
        this.O.b();
        org.telegram.ui.ActionBar.f6 f6Var = null;
        this.Q = null;
        int i11 = 1;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.x4 x4Var = new org.telegram.ui.Components.x4(parentActivity);
            x4Var.a = true;
            x4Var.b = org.telegram.messenger.g0.L(8.0f);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            x4Var.c = j6Var;
            int i12 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.r6.Z(j6Var, i12, null);
            j6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
            j6Var.setGravity(3);
            j6Var.setTypeface(org.telegram.messenger.g0.o());
            j6Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(12.0f));
            x4Var.addView(j6Var);
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            x4Var.d = j6Var2;
            j6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
            org.telegram.ui.ActionBar.r6.Z(j6Var2, i12, null);
            j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            j6Var2.setGravity(3);
            j6Var2.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
            x4Var.addView(j6Var2);
            j6Var.getDrawable().J = true;
            j6Var2.getDrawable().J = true;
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
            j6Var.b(1.0f, 150L, xqVar);
            j6Var2.b(1.0f, 150L, xqVar);
            x4Var.setClipChildren(false);
            this.E = x4Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z9 = org.telegram.messenger.id.a0;
            kVar.addView(x4Var, c8.ha.d(-1, -1.0f, 0, z9 ? 0.0f : 64.0f, 0.0f, z9 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.y;
        boolean z10 = this.J;
        int i14 = 2;
        if (i13 == 0 || i13 == 2) {
            if (z10) {
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750806, null));
            } else {
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750730, null));
            }
        } else if (i13 == 1) {
            d0();
        }
        int i15 = 19;
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, i15));
        e eVar = new e(i14, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 5);
        this.a = m1Var;
        m1Var.setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this.a, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        eVar.addView(this.a);
        lb1 lb1Var = new lb1(this, context);
        this.b = lb1Var;
        this.a.addView(lb1Var, c8.ha.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hb1
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
        ah.i iVar = new ah.i(10, context, this);
        this.c = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.B(this.c, org.telegram.ui.ActionBar.k6.Li, null);
        org.telegram.ui.ActionBar.r6.V(this.c, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.w(this.c, org.telegram.ui.ActionBar.k6.Mi, null);
        this.c.setCursorWidth(1.5f);
        ah.i iVar2 = this.c;
        iVar2.setInputType(iVar2.getInputType() | org.telegram.messenger.qs.G2);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        this.c.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(org.telegram.messenger.id.M0(2131745771, null));
        this.c.setCustomSelectionActionModeCallback(new li.a1(4));
        final int i16 = 1;
        this.c.setOnKeyListener(new p40(i16, this));
        this.c.addTextChangedListener(new m0(this, i15));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.e = mzVar;
        mzVar.setViewType(10);
        org.telegram.ui.Components.mz mzVar2 = this.e;
        mzVar2.x = false;
        mzVar2.setItemsCount(3);
        org.telegram.ui.Components.mz mzVar3 = this.e;
        int i17 = org.telegram.ui.ActionBar.k6.G8;
        int i18 = org.telegram.ui.ActionBar.k6.i6;
        mzVar3.e(i17, i18, i18);
        eVar.addView(this.e);
        org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(context, this.e, i11, f6Var, 2);
        this.f = p50Var;
        p50Var.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f.d.setText(org.telegram.messenger.id.M0(2131748224, null));
        eVar.addView(this.f);
        v4.b0 b0Var = new v4.b0(1, false);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.d = pj0Var;
        pj0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.pj0 pj0Var2 = this.d;
        kb1 kb1Var = new kb1(this, context);
        this.h = kb1Var;
        pj0Var2.setAdapter(kb1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        this.d.i(new di.k(15));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new di.p4(22, this, context));
        this.d.setOnScrollListener(new b21(this, 6));
        this.s = org.telegram.ui.Components.q00.b();
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.r = q00Var;
        q00Var.setImageResource(R.drawable.floating_check);
        eVar.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hb1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
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
        this.r.setContentDescription(org.telegram.messenger.id.M0(2131748251, null));
        int i19 = z10 ? 5 : 3;
        for (int i20 = 1; i20 <= i19; i20++) {
            String str = "non_contacts";
            if (this.y == 2) {
                if (i20 == 1) {
                    str = "existing_chats";
                    i7 = 1;
                } else if (i20 != 2 || this.I) {
                    if (i20 == (!this.I ? 1 : 0) + 2) {
                        str = "contacts";
                        i7 = 4;
                    }
                    i7 = 8;
                } else {
                    str = "new_chats";
                    i7 = 2;
                }
            } else if (z10) {
                if (i20 == 1) {
                    int i21 = org.telegram.messenger.qp.C8;
                    i7 = 1;
                    str = "contacts";
                } else if (i20 == 2) {
                    int i22 = org.telegram.messenger.qp.C8;
                    i7 = 2;
                } else if (i20 == 3) {
                    int i23 = org.telegram.messenger.qp.C8;
                    str = "groups";
                    i7 = 4;
                } else if (i20 == 4) {
                    int i24 = org.telegram.messenger.qp.C8;
                    str = "channels";
                    i7 = 8;
                } else {
                    int i25 = org.telegram.messenger.qp.C8;
                    str = "bots";
                    i7 = 16;
                }
            } else if (i20 == 1) {
                int i26 = org.telegram.messenger.qp.C8;
                str = "muted";
                i7 = 32;
            } else if (i20 == 2) {
                int i27 = org.telegram.messenger.qp.C8;
                str = "read";
                i7 = 64;
            } else {
                int i28 = org.telegram.messenger.qp.C8;
                str = "archived";
                i7 = 128;
            }
            if ((i7 & this.K) != 0) {
                org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(this.c.getContext(), str);
                this.b.a(c20Var, false);
                c20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.L;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i29 = 0; i29 < size; i29++) {
                Long l10 = (Long) arrayList.get(i29);
                Object a22 = l10.longValue() > 0 ? getMessagesController().a2(l10) : getMessagesController().M0(Long.valueOf(-l10.longValue()));
                if (a22 != null) {
                    org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(this.c.getContext(), a22);
                    this.b.a(c20Var2, false);
                    c20Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i7 = this.y;
        if (i7 == 0) {
            int i10 = getUserConfig().q() ? getMessagesController().O4 : getMessagesController().N4;
            int i11 = this.x;
            if (i11 == 0) {
                this.actionBar.setSubtitle(org.telegram.messenger.id.a0("MembersCountZero", null, 2131748620, org.telegram.messenger.id.G(i10, "Chats", new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(org.telegram.messenger.id.K0(i11, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(i10)));
                return;
            }
        }
        if (i7 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.x == 0) {
                this.E.getTitle().c(org.telegram.messenger.id.M0(2131745671, null), true, true);
                if (this.S > 0) {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.id.M0(2131745670, null), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(org.telegram.messenger.id.M0(2131745668, null), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.j6 title = this.E.getTitle();
            int i12 = this.x;
            title.setText(org.telegram.messenger.id.G(i12, "Chats", Integer.valueOf(i12)));
            if (this.S > 0) {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.id.M0(2131745669, null));
            } else {
                this.E.getSubtitleTextView().setText(org.telegram.messenger.id.M0(2131745667, null));
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O) {
            org.telegram.ui.Components.p50 p50Var = this.f;
            if (p50Var != null) {
                p50Var.e(false, true);
            }
            kb1 kb1Var = this.h;
            if (kb1Var != null) {
                kb1Var.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.r) {
            if (i7 == org.telegram.messenger.qs.R) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            int i11 = org.telegram.messenger.qp.C8;
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
        return this.D;
    }

    @Override // org.telegram.ui.ActionBar.f2
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (!c20Var.D) {
            org.telegram.ui.Components.c20 c20Var2 = this.Q;
            if (c20Var2 != null) {
                c20Var2.a();
            }
            this.Q = c20Var;
            c20Var.b();
            return;
        }
        this.Q = null;
        this.b.b(c20Var);
        if (this.y == 2) {
            if (c20Var.getUid() == -9223372036854775800L) {
                this.K &= -2;
            } else if (c20Var.getUid() == -9223372036854775799L) {
                this.K &= -3;
            } else if (c20Var.getUid() == Long.MIN_VALUE) {
                this.K &= -5;
            } else if (c20Var.getUid() == -9223372036854775807L) {
                this.K &= -9;
            }
        } else if (c20Var.getUid() == Long.MIN_VALUE) {
            int i7 = this.K;
            int i10 = org.telegram.messenger.qp.C8;
            this.K = i7 & (-2);
        } else if (c20Var.getUid() == -9223372036854775807L) {
            int i11 = this.K;
            int i12 = org.telegram.messenger.qp.C8;
            this.K = i11 & (-3);
        } else if (c20Var.getUid() == -9223372036854775806L) {
            int i13 = this.K;
            int i14 = org.telegram.messenger.qp.C8;
            this.K = i13 & (-5);
        } else if (c20Var.getUid() == -9223372036854775805L) {
            int i15 = this.K;
            int i16 = org.telegram.messenger.qp.C8;
            this.K = i15 & (-9);
        } else if (c20Var.getUid() == -9223372036854775804L) {
            int i17 = this.K;
            int i18 = org.telegram.messenger.qp.C8;
            this.K = i17 & (-17);
        } else if (c20Var.getUid() == -9223372036854775803L) {
            int i19 = this.K;
            int i20 = org.telegram.messenger.qp.C8;
            this.K = i19 & (-33);
        } else if (c20Var.getUid() == -9223372036854775802L) {
            int i21 = this.K;
            int i22 = org.telegram.messenger.qp.C8;
            this.K = i21 & (-65);
        } else if (c20Var.getUid() == -9223372036854775801L) {
            int i23 = this.K;
            int i24 = org.telegram.messenger.qp.C8;
            this.K = i23 & (-129);
        }
        d0();
        b0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        ah.i iVar = this.c;
        if (iVar != null) {
            iVar.requestFocus();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ah.i iVar = this.c;
            if (iVar != null) {
                org.telegram.ui.ActionBar.r6.m(iVar, 34, org.telegram.ui.ActionBar.k6.Li, null);
                org.telegram.ui.ActionBar.r6.w(this.c, org.telegram.ui.ActionBar.k6.Mi, null);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.d;
            if (pj0Var != null) {
                pj0Var.x1();
            }
            org.telegram.ui.ActionBar.m1 m1Var = this.a;
            if (m1Var != null) {
                org.telegram.messenger.g0.z3(m1Var, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            }
            if (this.b != null) {
                for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                    View childAt = this.b.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.c20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setContainerHeight(int i7) {
        this.D = i7;
        lb1 lb1Var = this.b;
        if (lb1Var != null) {
            lb1Var.requestLayout();
        }
    }
}
