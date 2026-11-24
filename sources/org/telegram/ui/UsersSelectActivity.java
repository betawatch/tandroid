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
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.d implements gk7, View.OnClickListener {
    public int E;
    public il F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public vf6 P;
    public ArrayList Q;
    public ya5 R;
    public int S;
    public int T;
    public xc a;
    public c8c b;
    public l7 c;
    public o39 d;
    public pi4 e;
    public na5 f;
    public b8c h;
    public z7c n;
    public un4 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public byte y;

    public UsersSelectActivity(int i, ArrayList arrayList, boolean z) {
        super(null);
        this.P = new vf6();
        this.Q = new ArrayList();
        this.K = z;
        this.L = i;
        this.M = arrayList;
        this.y = (byte) 0;
        this.H = true;
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
    public final void Z() {
        long j;
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            if (childAt instanceof za5) {
                za5 za5Var = (za5) childAt;
                Object object = za5Var.getObject();
                if (object instanceof String) {
                    String str = (String) object;
                    j = -9223372036854775800L;
                    switch (str.hashCode()) {
                        case -1716307998:
                            str.equals("archived");
                            j = -9223372036854775801L;
                            break;
                        case -1237460524:
                            if (str.equals("groups")) {
                                j = -9223372036854775806L;
                                break;
                            }
                            j = -9223372036854775801L;
                            break;
                        case -1197490811:
                            if (str.equals("non_contacts")) {
                                j = -9223372036854775807L;
                                break;
                            }
                            j = -9223372036854775801L;
                            break;
                        case -567451565:
                            if (str.equals("contacts")) {
                                j = Long.MIN_VALUE;
                                break;
                            }
                            j = -9223372036854775801L;
                            break;
                        case -268161860:
                            break;
                        case 3029900:
                            if (str.equals("bots")) {
                                j = -9223372036854775804L;
                                break;
                            }
                            j = -9223372036854775801L;
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                j = -9223372036854775802L;
                                break;
                            }
                            j = -9223372036854775801L;
                            break;
                        case 104264043:
                            if (str.equals("muted")) {
                                j = -9223372036854775803L;
                                break;
                            }
                            j = -9223372036854775801L;
                            break;
                        case 151051367:
                            break;
                        case 1432626128:
                            if (str.equals("channels")) {
                                j = -9223372036854775805L;
                                break;
                            }
                            j = -9223372036854775801L;
                            break;
                        default:
                            j = -9223372036854775801L;
                            break;
                    }
                } else {
                    j = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                if (j != 0) {
                    za5Var.c(this.P.h(j) >= 0, true);
                    za5Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(Context context, View view, int i) {
        long j;
        boolean z;
        vf6 vf6Var = this.P;
        if (view instanceof za5) {
            za5 za5Var = (za5) view;
            Object object = za5Var.getObject();
            boolean z2 = object instanceof String;
            if (z2) {
                j = -9223372036854775807L;
                int i2 = 8;
                if (this.y == 2) {
                    if (i == 1) {
                        j = -9223372036854775800L;
                        i2 = 1;
                    } else if (i == 2 && !this.J) {
                        j = -9223372036854775799L;
                        i2 = 2;
                    } else if (i == (!this.J ? 1 : 0) + 2) {
                        j = Long.MIN_VALUE;
                        i2 = 4;
                    }
                    wf2 wf2Var = za5Var.d;
                    z = wf2Var == null ? wf2Var.a.q : za5Var.I;
                    int i3 = this.L;
                    if (z) {
                        this.L = i3 | i2;
                    } else {
                        this.L = i3 & (~i2);
                    }
                } else {
                    if (this.K) {
                        if (i == 1) {
                            int i4 = na7.q5;
                            i2 = 1;
                            j = Long.MIN_VALUE;
                        } else if (i == 2) {
                            int i5 = na7.q5;
                            i2 = 2;
                        } else if (i == 3) {
                            int i6 = na7.q5;
                            j = -9223372036854775806L;
                            i2 = 4;
                        } else if (i == 4) {
                            int i7 = na7.q5;
                            j = -9223372036854775805L;
                        } else {
                            int i8 = na7.q5;
                            i2 = 16;
                            j = -9223372036854775804L;
                        }
                    } else if (i == 1) {
                        int i9 = na7.q5;
                        i2 = 32;
                        j = -9223372036854775803L;
                    } else if (i == 2) {
                        int i10 = na7.q5;
                        i2 = 64;
                        j = -9223372036854775802L;
                    } else {
                        int i11 = na7.q5;
                        i2 = 128;
                        j = -9223372036854775801L;
                    }
                    wf2 wf2Var2 = za5Var.d;
                    if (wf2Var2 == null) {
                    }
                    int i32 = this.L;
                    if (z) {
                    }
                }
            } else if (object instanceof TLRPC.User) {
                j = ((TLRPC.User) object).id;
            } else {
                if (!(object instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j = -chat.id;
                if (this.y == 1 && !hc2.y(13, chat)) {
                    yjb.x(null, 2131748107, u21.b0(this), null);
                    return;
                }
            }
            boolean z3 = vf6Var.h(j) >= 0;
            if (z3) {
                this.b.b((ya5) vf6Var.f(j));
            } else if ((!z2 && !getUserConfig().p() && this.x >= na7.q1(this.currentAccount).k4.b1.f()) || this.x >= na7.q1(this.currentAccount).k4.c1.f()) {
                h26 h26Var = new h26(4, this.currentAccount, null, context, this);
                h26Var.r2 = this.x;
                showDialog(h26Var);
                return;
            } else {
                if (object instanceof TLRPC.User) {
                    na7.q1(this.currentAccount).Z3((TLRPC.User) object, !this.O, false);
                } else if (object instanceof TLRPC.Chat) {
                    na7.q1(this.currentAccount).S3((TLRPC.Chat) object, !this.O);
                }
                ya5 ya5Var = new ya5(this.c.getContext(), object);
                this.b.a(ya5Var, true);
                ya5Var.setOnClickListener(this);
            }
            c0();
            if (this.O || this.N) {
                gl.F3(this.c);
            } else {
                za5Var.c(!z3, true);
            }
            if (this.c.length() > 0) {
                this.c.setText((CharSequence) null);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.Ri));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void b0() {
        vf6 vf6Var = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vf6Var.m(); i++) {
            if (vf6Var.j(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(vf6Var.j(i)));
            }
        }
        z7c z7cVar = this.n;
        if (z7cVar != null) {
            z7cVar.a(this.L, arrayList);
        }
        finishFragment();
    }

    public final void c0() {
        byte b = this.y;
        if (b == 0) {
            int f = (getUserConfig().p() ? getMessagesController().k4.c1 : getMessagesController().k4.b1).f();
            int i = this.x;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (i == 0) {
                aVar.setSubtitle(k96.a0("MembersCountZero", null, 2131748427, k96.G(f, "Chats", new Object[0])));
                return;
            } else {
                aVar.setSubtitle(String.format(k96.J0(i, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(f)));
                return;
            }
        }
        if (b == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            int i2 = this.x;
            il ilVar = this.F;
            if (i2 == 0) {
                ilVar.getTitle().c(k96.M0(2131745476, null), true, true);
                int i3 = this.T;
                il ilVar2 = this.F;
                if (i3 > 0) {
                    ilVar2.getSubtitleTextView().c(k96.M0(2131745475, null), true, true);
                    return;
                } else {
                    ilVar2.getSubtitleTextView().c(k96.M0(2131745473, null), true, true);
                    return;
                }
            }
            hn title = ilVar.getTitle();
            int i4 = this.x;
            title.setText(k96.G(i4, "Chats", Integer.valueOf(i4)));
            int i5 = this.T;
            il ilVar3 = this.F;
            if (i5 > 0) {
                ilVar3.getSubtitleTextView().setText(k96.M0(2131745474, null));
            } else {
                ilVar3.getSubtitleTextView().setText(k96.M0(2131745472, null));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i;
        final byte b = 0;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        wjb wjbVar = null;
        this.R = null;
        byte b2 = 3;
        int i2 = 1;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            il ilVar = new il(parentActivity);
            ilVar.a = true;
            ilVar.b = gl.L(8.0f);
            hn hnVar = new hn(parentActivity, true, true, true);
            ilVar.c = hnVar;
            int i3 = bkb.z8;
            zkb.U(hnVar, i3, null);
            hnVar.setTextSize(gl.L(18.0f));
            hnVar.setGravity(3);
            hnVar.setTypeface(gl.o());
            hnVar.setPadding(0, gl.L(6.0f), 0, gl.L(12.0f));
            ilVar.addView(hnVar);
            hn hnVar2 = new hn(parentActivity, true, true, true);
            ilVar.d = hnVar2;
            hnVar2.setTag(Integer.valueOf(bkb.A8));
            zkb.U(hnVar2, i3, null);
            hnVar2.setTextSize(gl.L(14.0f));
            hnVar2.setGravity(3);
            hnVar2.setPadding(0, 0, gl.L(10.0f), 0);
            ilVar.addView(hnVar2);
            hnVar.getDrawable().K = true;
            hnVar2.getDrawable().K = true;
            s33 s33Var = s33.f;
            hnVar.b(1.0f, 150L, s33Var);
            hnVar2.b(1.0f, 150L, s33Var);
            ilVar.setClipChildren(false);
            this.F = ilVar;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            boolean z = k96.a0;
            aVar.addView(ilVar, nme.d(-1, -1.0f, 0, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        byte b3 = this.y;
        boolean z2 = this.K;
        if (b3 == 0 || b3 == 2) {
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (z2) {
                aVar2.setTitle(k96.M0(2131750793, null));
            } else {
                aVar2.setTitle(k96.M0(2131750717, null));
            }
        } else if (b3 == 1) {
            c0();
        }
        this.actionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 25));
        s8 s8Var = new s8(b2, context, this);
        this.fragmentView = s8Var;
        xc xcVar = new xc(this, context, (byte) 5);
        this.a = xcVar;
        xcVar.setVerticalScrollBarEnabled(false);
        gl.v3(this.a, bkb.w0(null, bkb.c6, false));
        s8Var.addView(this.a);
        c8c c8cVar = new c8c(this, context);
        this.b = c8cVar;
        this.a.addView(c8cVar, nme.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: y7c
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                UsersSelectActivity usersSelectActivity = this.b;
                switch (b4) {
                    case 0:
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        gl.F3(usersSelectActivity.c);
                        break;
                    default:
                        usersSelectActivity.b0();
                        break;
                }
            }
        });
        l7 l7Var = new l7((byte) 9, context, this);
        this.c = l7Var;
        l7Var.setTextSize(1, 16.0f);
        zkb.A(this.c, bkb.Ni, null);
        zkb.X(this.c, bkb.F6, null);
        zkb.v(this.c, bkb.Oi, null);
        this.c.setCursorWidth(1.5f);
        l7 l7Var2 = this.c;
        l7Var2.setInputType(l7Var2.getInputType() | kk7.F2);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        byte b4 = 16;
        this.c.setGravity((k96.a0 ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(k96.M0(2131745576, null));
        this.c.setCustomSelectionActionModeCallback(new kv7((byte) 4));
        final byte b5 = 1;
        this.c.setOnKeyListener(new ia5(this, b5));
        this.c.addTextChangedListener(new jf6(this, (byte) 22));
        pi4 pi4Var = new pi4(context, null);
        this.e = pi4Var;
        pi4Var.setViewType(10);
        pi4 pi4Var2 = this.e;
        pi4Var2.x = false;
        pi4Var2.setItemsCount(3);
        pi4 pi4Var3 = this.e;
        int i4 = bkb.F8;
        int i5 = bkb.h6;
        pi4Var3.e(i4, i5, i5);
        s8Var.addView(this.e);
        na5 na5Var = new na5(context, this.e, i2, wjbVar, (byte) 2);
        this.f = na5Var;
        na5Var.e(qu2.r(this.currentAccount).y(), true);
        this.f.d.setText(k96.M0(2131748031, null));
        s8Var.addView(this.f);
        t26 t26Var = new t26(1, false);
        o39 o39Var = new o39(context, null);
        this.d = o39Var;
        o39Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        o39 o39Var2 = this.d;
        b8c b8cVar = new b8c(this, context);
        this.h = b8cVar;
        o39Var2.setAdapter(b8cVar);
        this.d.setLayoutManager(t26Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(k96.a0 ? 1 : 2);
        this.d.i(new oq1(b4));
        s8Var.addView(this.d);
        this.d.setOnItemClickListener(new k0(this, context, (byte) 24));
        this.d.setOnScrollListener(new vdb(this, (byte) 7));
        this.s = un4.b();
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.r = un4Var;
        un4Var.setImageResource(R.drawable.floating_check);
        s8Var.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: y7c
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b42 = b5;
                UsersSelectActivity usersSelectActivity = this.b;
                switch (b42) {
                    case 0:
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        gl.F3(usersSelectActivity.c);
                        break;
                    default:
                        usersSelectActivity.b0();
                        break;
                }
            }
        });
        this.r.setContentDescription(k96.M0(2131748058, null));
        byte b6 = z2 ? (byte) 5 : (byte) 3;
        for (int i6 = 1; i6 <= b6; i6++) {
            String str = "non_contacts";
            if (this.y == 2) {
                if (i6 == 1) {
                    str = "existing_chats";
                    i = 1;
                } else if (i6 != 2 || this.J) {
                    if (i6 == (!this.J ? 1 : 0) + 2) {
                        str = "contacts";
                        i = 4;
                    }
                    i = 8;
                } else {
                    str = "new_chats";
                    i = 2;
                }
            } else if (z2) {
                if (i6 == 1) {
                    int i7 = na7.q5;
                    i = 1;
                    str = "contacts";
                } else if (i6 == 2) {
                    int i8 = na7.q5;
                    i = 2;
                } else if (i6 == 3) {
                    int i9 = na7.q5;
                    str = "groups";
                    i = 4;
                } else if (i6 == 4) {
                    int i10 = na7.q5;
                    str = "channels";
                    i = 8;
                } else {
                    int i11 = na7.q5;
                    str = "bots";
                    i = 16;
                }
            } else if (i6 == 1) {
                int i12 = na7.q5;
                str = "muted";
                i = 32;
            } else if (i6 == 2) {
                int i13 = na7.q5;
                str = "read";
                i = 64;
            } else {
                int i14 = na7.q5;
                str = "archived";
                i = 128;
            }
            if ((this.L & i) != 0) {
                ya5 ya5Var = new ya5(this.c.getContext(), str);
                this.b.a(ya5Var, false);
                ya5Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                Long l = (Long) arrayList.get(i15);
                Object V1 = l.longValue() > 0 ? getMessagesController().V1(l) : getMessagesController().K0(Long.valueOf(-l.longValue()));
                if (V1 != null) {
                    ya5 ya5Var2 = new ya5(this.c.getContext(), V1);
                    this.b.a(ya5Var2, false);
                    ya5Var2.setOnClickListener(this);
                }
            }
        }
        c0();
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.N) {
            na5 na5Var = this.f;
            if (na5Var != null) {
                na5Var.e(false, true);
            }
            b8c b8cVar = this.h;
            if (b8cVar != null) {
                b8cVar.f();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == kk7.Q) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            int i3 = na7.q5;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.d.getChildAt(i4);
                if (childAt instanceof za5) {
                    ((za5) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ni));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.Qi));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.h7));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.i7));
        arrayList.add(new blb(this.d, 4, new Class[]{za5.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        arrayList.add(new blb(this.b, 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Si));
        arrayList.add(new blb(this.b, 0, new Class[]{ya5.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ti));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ya5 ya5Var = (ya5) view;
        if (!ya5Var.E) {
            ya5 ya5Var2 = this.R;
            if (ya5Var2 != null) {
                ya5Var2.a();
            }
            this.R = ya5Var;
            ya5Var.b();
            return;
        }
        this.R = null;
        this.b.b(ya5Var);
        if (this.y == 2) {
            if (ya5Var.getUid() == -9223372036854775800L) {
                this.L &= -2;
            } else if (ya5Var.getUid() == -9223372036854775799L) {
                this.L &= -3;
            } else if (ya5Var.getUid() == Long.MIN_VALUE) {
                this.L &= -5;
            } else if (ya5Var.getUid() == -9223372036854775807L) {
                this.L &= -9;
            }
        } else if (ya5Var.getUid() == Long.MIN_VALUE) {
            int i = this.L;
            int i2 = na7.q5;
            this.L = i & (-2);
        } else if (ya5Var.getUid() == -9223372036854775807L) {
            int i3 = this.L;
            int i4 = na7.q5;
            this.L = i3 & (-3);
        } else if (ya5Var.getUid() == -9223372036854775806L) {
            int i5 = this.L;
            int i6 = na7.q5;
            this.L = i5 & (-5);
        } else if (ya5Var.getUid() == -9223372036854775805L) {
            int i7 = this.L;
            int i8 = na7.q5;
            this.L = i7 & (-9);
        } else if (ya5Var.getUid() == -9223372036854775804L) {
            int i9 = this.L;
            int i10 = na7.q5;
            this.L = i9 & (-17);
        } else if (ya5Var.getUid() == -9223372036854775803L) {
            int i11 = this.L;
            int i12 = na7.q5;
            this.L = i11 & (-33);
        } else if (ya5Var.getUid() == -9223372036854775802L) {
            int i13 = this.L;
            int i14 = na7.q5;
            this.L = i13 & (-65);
        } else if (ya5Var.getUid() == -9223372036854775801L) {
            int i15 = this.L;
            int i16 = na7.q5;
            this.L = i15 & (-129);
        }
        c0();
        Z();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.N);
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.Q);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.N);
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.Q);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        l7 l7Var = this.c;
        if (l7Var != null) {
            l7Var.requestFocus();
        }
        gl.W2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            l7 l7Var = this.c;
            if (l7Var != null) {
                zkb.l(l7Var, 34, bkb.Ni, null);
                zkb.v(this.c, bkb.Oi, null);
            }
            o39 o39Var = this.d;
            if (o39Var != null) {
                o39Var.x1();
            }
            xc xcVar = this.a;
            if (xcVar != null) {
                gl.v3(xcVar, bkb.w0(null, bkb.c6, false));
            }
            if (this.b != null) {
                for (int i = 0; i < this.b.getChildCount(); i++) {
                    View childAt = this.b.getChildAt(i);
                    if (childAt instanceof ya5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void setContainerHeight(int i) {
        this.E = i;
        c8c c8cVar = this.b;
        if (c8cVar != null) {
            c8cVar.requestLayout();
        }
    }
}
