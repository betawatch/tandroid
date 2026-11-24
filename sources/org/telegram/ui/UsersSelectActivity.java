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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.d implements jm7, View.OnClickListener {
    public int E;
    public im F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public vh6 P;
    public ArrayList Q;
    public wc5 R;
    public int S;
    public int T;
    public xd a;
    public dac b;
    public l7 c;
    public r59 d;
    public tk4 e;
    public lc5 f;
    public cac h;
    public aac n;
    public wp4 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public byte y;

    public UsersSelectActivity(int i, ArrayList arrayList, boolean z) {
        super(null);
        this.P = new vh6();
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
    public final void a0() {
        long j;
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            if (childAt instanceof xc5) {
                xc5 xc5Var = (xc5) childAt;
                Object object = xc5Var.getObject();
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
                    xc5Var.c(this.P.h(j) >= 0, true);
                    xc5Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.Ri));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.m6));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(Context context, View view, int i) {
        long j;
        boolean z;
        vh6 vh6Var = this.P;
        if (view instanceof xc5) {
            xc5 xc5Var = (xc5) view;
            Object object = xc5Var.getObject();
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
                    jh2 jh2Var = xc5Var.d;
                    z = jh2Var == null ? jh2Var.a.q : xc5Var.I;
                    int i3 = this.L;
                    if (z) {
                        this.L = i3 | i2;
                    } else {
                        this.L = i3 & (~i2);
                    }
                } else {
                    if (this.K) {
                        if (i == 1) {
                            int i4 = oc7.s5;
                            i2 = 1;
                            j = Long.MIN_VALUE;
                        } else if (i == 2) {
                            int i5 = oc7.s5;
                            i2 = 2;
                        } else if (i == 3) {
                            int i6 = oc7.s5;
                            j = -9223372036854775806L;
                            i2 = 4;
                        } else if (i == 4) {
                            int i7 = oc7.s5;
                            j = -9223372036854775805L;
                        } else {
                            int i8 = oc7.s5;
                            i2 = 16;
                            j = -9223372036854775804L;
                        }
                    } else if (i == 1) {
                        int i9 = oc7.s5;
                        i2 = 32;
                        j = -9223372036854775803L;
                    } else if (i == 2) {
                        int i10 = oc7.s5;
                        i2 = 64;
                        j = -9223372036854775802L;
                    } else {
                        int i11 = oc7.s5;
                        i2 = 128;
                        j = -9223372036854775801L;
                    }
                    jh2 jh2Var2 = xc5Var.d;
                    if (jh2Var2 == null) {
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
                if (this.y == 1 && !sd2.y(13, chat)) {
                    mlb.y(null, 2131748056, c41.b0(this), null);
                    return;
                }
            }
            boolean z3 = vh6Var.h(j) >= 0;
            if (z3) {
                this.b.b((wc5) vh6Var.f(j));
            } else if ((!z2 && !getUserConfig().p() && this.x >= oc7.r1(this.currentAccount).l4.b1.f()) || this.x >= oc7.r1(this.currentAccount).l4.c1.f()) {
                i46 i46Var = new i46(4, this.currentAccount, null, context, this);
                i46Var.r2 = this.x;
                showDialog(i46Var);
                return;
            } else {
                if (object instanceof TLRPC.User) {
                    oc7.r1(this.currentAccount).c4((TLRPC.User) object, !this.O, false);
                } else if (object instanceof TLRPC.Chat) {
                    oc7.r1(this.currentAccount).V3((TLRPC.Chat) object, !this.O);
                }
                wc5 wc5Var = new wc5(this.c.getContext(), object);
                this.b.a(wc5Var, true);
                wc5Var.setOnClickListener(this);
            }
            d0();
            if (this.O || this.N) {
                gm.E3(this.c);
            } else {
                xc5Var.c(!z3, true);
            }
            if (this.c.length() > 0) {
                this.c.setText((CharSequence) null);
            }
        }
    }

    public final void c0() {
        vh6 vh6Var = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vh6Var.m(); i++) {
            if (vh6Var.j(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(vh6Var.j(i)));
            }
        }
        aac aacVar = this.n;
        if (aacVar != null) {
            aacVar.a(this.L, arrayList);
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i;
        final byte b = 0;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        ylb ylbVar = null;
        this.R = null;
        byte b2 = 3;
        int i2 = 1;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            im imVar = new im(parentActivity);
            imVar.a = true;
            imVar.b = gm.L(8.0f);
            io ioVar = new io(parentActivity, true, true, true);
            imVar.c = ioVar;
            int i3 = cmb.z8;
            anb.U(ioVar, i3, null);
            ioVar.setTextSize(gm.L(18.0f));
            ioVar.setGravity(3);
            ioVar.setTypeface(gm.o());
            ioVar.setPadding(0, gm.L(6.0f), 0, gm.L(12.0f));
            imVar.addView(ioVar);
            io ioVar2 = new io(parentActivity, true, true, true);
            imVar.d = ioVar2;
            ioVar2.setTag(Integer.valueOf(cmb.A8));
            anb.U(ioVar2, i3, null);
            ioVar2.setTextSize(gm.L(14.0f));
            ioVar2.setGravity(3);
            ioVar2.setPadding(0, 0, gm.L(10.0f), 0);
            imVar.addView(ioVar2);
            ioVar.getDrawable().K = true;
            ioVar2.getDrawable().K = true;
            d53 d53Var = d53.f;
            ioVar.b(1.0f, 150L, d53Var);
            ioVar2.b(1.0f, 150L, d53Var);
            imVar.setClipChildren(false);
            this.F = imVar;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            boolean z = jb6.a0;
            aVar.addView(imVar, qoe.d(-1, -1.0f, 0, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        byte b3 = this.y;
        boolean z2 = this.K;
        if (b3 == 0 || b3 == 2) {
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (z2) {
                aVar2.setTitle(jb6.M0(2131750742, null));
            } else {
                aVar2.setTitle(jb6.M0(2131750666, null));
            }
        } else if (b3 == 1) {
            d0();
        }
        this.actionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 26));
        s8 s8Var = new s8(b2, context, this);
        this.fragmentView = s8Var;
        xd xdVar = new xd(this, context, (byte) 6);
        this.a = xdVar;
        xdVar.setVerticalScrollBarEnabled(false);
        gm.u3(this.a, cmb.w0(null, cmb.c6, false));
        s8Var.addView(this.a);
        dac dacVar = new dac(this, context);
        this.b = dacVar;
        this.a.addView(dacVar, qoe.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: z9c
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
                        gm.E3(usersSelectActivity.c);
                        break;
                    default:
                        usersSelectActivity.c0();
                        break;
                }
            }
        });
        l7 l7Var = new l7((byte) 9, context, this);
        this.c = l7Var;
        l7Var.setTextSize(1, 16.0f);
        anb.A(this.c, cmb.Ni, null);
        anb.X(this.c, cmb.F6, null);
        anb.v(this.c, cmb.Oi, null);
        this.c.setCursorWidth(1.5f);
        l7 l7Var2 = this.c;
        l7Var2.setInputType(l7Var2.getInputType() | nm7.F2);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        byte b4 = 16;
        this.c.setGravity((jb6.a0 ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(jb6.M0(2131745502, null));
        this.c.setCustomSelectionActionModeCallback(new mx7((byte) 4));
        final byte b5 = 1;
        this.c.setOnKeyListener(new gc5(this, b5));
        this.c.addTextChangedListener(new og6(this, (byte) 23));
        tk4 tk4Var = new tk4(context, null);
        this.e = tk4Var;
        tk4Var.setViewType(10);
        tk4 tk4Var2 = this.e;
        tk4Var2.x = false;
        tk4Var2.setItemsCount(3);
        tk4 tk4Var3 = this.e;
        int i4 = cmb.F8;
        int i5 = cmb.h6;
        tk4Var3.e(i4, i5, i5);
        s8Var.addView(this.e);
        lc5 lc5Var = new lc5(context, this.e, i2, ylbVar, (byte) 2);
        this.f = lc5Var;
        lc5Var.e(bw2.r(this.currentAccount).y(), true);
        this.f.d.setText(jb6.M0(2131747957, null));
        s8Var.addView(this.f);
        u46 u46Var = new u46(1, false);
        r59 r59Var = new r59(context, null);
        this.d = r59Var;
        r59Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        r59 r59Var2 = this.d;
        cac cacVar = new cac(this, context);
        this.h = cacVar;
        r59Var2.setAdapter(cacVar);
        this.d.setLayoutManager(u46Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
        this.d.i(new as1(b4));
        s8Var.addView(this.d);
        this.d.setOnItemClickListener(new k0(this, context, (byte) 24));
        this.d.setOnScrollListener(new k2b(this, (byte) 8));
        this.s = wp4.b();
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.r = wp4Var;
        wp4Var.setImageResource(R.drawable.floating_check);
        s8Var.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: z9c
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
                        gm.E3(usersSelectActivity.c);
                        break;
                    default:
                        usersSelectActivity.c0();
                        break;
                }
            }
        });
        this.r.setContentDescription(jb6.M0(2131747984, null));
        int i6 = z2 ? 5 : 3;
        for (int i7 = 1; i7 <= i6; i7++) {
            String str = "non_contacts";
            if (this.y == 2) {
                if (i7 == 1) {
                    str = "existing_chats";
                    i = 1;
                } else if (i7 != 2 || this.J) {
                    if (i7 == (!this.J ? 1 : 0) + 2) {
                        str = "contacts";
                        i = 4;
                    }
                    i = 8;
                } else {
                    str = "new_chats";
                    i = 2;
                }
            } else if (z2) {
                if (i7 == 1) {
                    int i8 = oc7.s5;
                    i = 1;
                    str = "contacts";
                } else if (i7 == 2) {
                    int i9 = oc7.s5;
                    i = 2;
                } else if (i7 == 3) {
                    int i10 = oc7.s5;
                    str = "groups";
                    i = 4;
                } else if (i7 == 4) {
                    int i11 = oc7.s5;
                    str = "channels";
                    i = 8;
                } else {
                    int i12 = oc7.s5;
                    str = "bots";
                    i = 16;
                }
            } else if (i7 == 1) {
                int i13 = oc7.s5;
                str = "muted";
                i = 32;
            } else if (i7 == 2) {
                int i14 = oc7.s5;
                str = "read";
                i = 64;
            } else {
                int i15 = oc7.s5;
                str = "archived";
                i = 128;
            }
            if ((this.L & i) != 0) {
                wc5 wc5Var = new wc5(this.c.getContext(), str);
                this.b.a(wc5Var, false);
                wc5Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Long l = (Long) arrayList.get(i16);
                Object W1 = l.longValue() > 0 ? getMessagesController().W1(l) : getMessagesController().L0(Long.valueOf(-l.longValue()));
                if (W1 != null) {
                    wc5 wc5Var2 = new wc5(this.c.getContext(), W1);
                    this.b.a(wc5Var2, false);
                    wc5Var2.setOnClickListener(this);
                }
            }
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        byte b = this.y;
        if (b == 0) {
            int f = (getUserConfig().p() ? getMessagesController().l4.c1 : getMessagesController().l4.b1).f();
            int i = this.x;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (i == 0) {
                aVar.setSubtitle(jb6.a0("MembersCountZero", null, 2131748376, jb6.G(f, "Chats", new Object[0])));
                return;
            } else {
                aVar.setSubtitle(String.format(jb6.J0(i, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(f)));
                return;
            }
        }
        if (b == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            int i2 = this.x;
            im imVar = this.F;
            if (i2 == 0) {
                imVar.getTitle().c(jb6.M0(2131745402, null), true, true);
                int i3 = this.T;
                im imVar2 = this.F;
                if (i3 > 0) {
                    imVar2.getSubtitleTextView().c(jb6.M0(2131745401, null), true, true);
                    return;
                } else {
                    imVar2.getSubtitleTextView().c(jb6.M0(2131745399, null), true, true);
                    return;
                }
            }
            io title = imVar.getTitle();
            int i4 = this.x;
            title.setText(jb6.G(i4, "Chats", Integer.valueOf(i4)));
            int i5 = this.T;
            im imVar3 = this.F;
            if (i5 > 0) {
                imVar3.getSubtitleTextView().setText(jb6.M0(2131745400, null));
            } else {
                imVar3.getSubtitleTextView().setText(jb6.M0(2131745398, null));
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.N) {
            lc5 lc5Var = this.f;
            if (lc5Var != null) {
                lc5Var.e(false, true);
            }
            cac cacVar = this.h;
            if (cacVar != null) {
                cacVar.f();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == nm7.R) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            int i3 = oc7.s5;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.d.getChildAt(i4);
                if (childAt instanceof xc5) {
                    ((xc5) childAt).f(intValue);
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
        arrayList.add(new cnb(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ni));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.Qi));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.h7));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.i7));
        arrayList.add(new cnb(this.d, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        arrayList.add(new cnb(this.b, 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Si));
        arrayList.add(new cnb(this.b, 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ti));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wc5 wc5Var = (wc5) view;
        if (!wc5Var.E) {
            wc5 wc5Var2 = this.R;
            if (wc5Var2 != null) {
                wc5Var2.a();
            }
            this.R = wc5Var;
            wc5Var.b();
            return;
        }
        this.R = null;
        this.b.b(wc5Var);
        if (this.y == 2) {
            if (wc5Var.getUid() == -9223372036854775800L) {
                this.L &= -2;
            } else if (wc5Var.getUid() == -9223372036854775799L) {
                this.L &= -3;
            } else if (wc5Var.getUid() == Long.MIN_VALUE) {
                this.L &= -5;
            } else if (wc5Var.getUid() == -9223372036854775807L) {
                this.L &= -9;
            }
        } else if (wc5Var.getUid() == Long.MIN_VALUE) {
            int i = this.L;
            int i2 = oc7.s5;
            this.L = i & (-2);
        } else if (wc5Var.getUid() == -9223372036854775807L) {
            int i3 = this.L;
            int i4 = oc7.s5;
            this.L = i3 & (-3);
        } else if (wc5Var.getUid() == -9223372036854775806L) {
            int i5 = this.L;
            int i6 = oc7.s5;
            this.L = i5 & (-5);
        } else if (wc5Var.getUid() == -9223372036854775805L) {
            int i7 = this.L;
            int i8 = oc7.s5;
            this.L = i7 & (-9);
        } else if (wc5Var.getUid() == -9223372036854775804L) {
            int i9 = this.L;
            int i10 = oc7.s5;
            this.L = i9 & (-17);
        } else if (wc5Var.getUid() == -9223372036854775803L) {
            int i11 = this.L;
            int i12 = oc7.s5;
            this.L = i11 & (-33);
        } else if (wc5Var.getUid() == -9223372036854775802L) {
            int i13 = this.L;
            int i14 = oc7.s5;
            this.L = i13 & (-65);
        } else if (wc5Var.getUid() == -9223372036854775801L) {
            int i15 = this.L;
            int i16 = oc7.s5;
            this.L = i15 & (-129);
        }
        d0();
        a0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.N);
        nm7.f(this.currentAccount).b(this, 2);
        nm7.f(this.currentAccount).b(this, nm7.R);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.N);
        nm7.f(this.currentAccount).n(this, 2);
        nm7.f(this.currentAccount).n(this, nm7.R);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        l7 l7Var = this.c;
        if (l7Var != null) {
            l7Var.requestFocus();
        }
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            l7 l7Var = this.c;
            if (l7Var != null) {
                anb.l(l7Var, 34, cmb.Ni, null);
                anb.v(this.c, cmb.Oi, null);
            }
            r59 r59Var = this.d;
            if (r59Var != null) {
                r59Var.x1();
            }
            xd xdVar = this.a;
            if (xdVar != null) {
                gm.u3(xdVar, cmb.w0(null, cmb.c6, false));
            }
            if (this.b != null) {
                for (int i = 0; i < this.b.getChildCount(); i++) {
                    View childAt = this.b.getChildAt(i);
                    if (childAt instanceof wc5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void setContainerHeight(int i) {
        this.E = i;
        dac dacVar = this.b;
        if (dacVar != null) {
            dacVar.requestLayout();
        }
    }
}
