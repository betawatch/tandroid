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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.e implements fn7, View.OnClickListener {
    public int E;
    public jl F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public zh6 P;
    public ArrayList Q;
    public zc5 R;
    public int S;
    public int T;
    public yc a;
    public ccc b;
    public m7 c;
    public d79 d;
    public tk4 e;
    public oc5 f;
    public bcc h;
    public zbc n;
    public zp4 r;
    public FrameLayout.LayoutParams s;
    public boolean w;
    public int x;
    public byte y;

    public UsersSelectActivity(int i, ArrayList arrayList, boolean z) {
        super(null);
        this.P = new zh6();
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
            if (childAt instanceof bd5) {
                bd5 bd5Var = (bd5) childAt;
                Object object = bd5Var.getObject();
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
                    bd5Var.c(this.P.h(j) >= 0, true);
                    bd5Var.setCheckBoxEnabled(true);
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
        zh6 zh6Var = this.P;
        if (view instanceof bd5) {
            bd5 bd5Var = (bd5) view;
            Object object = bd5Var.getObject();
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
                    og2 og2Var = bd5Var.d;
                    z = og2Var == null ? og2Var.a.q : bd5Var.I;
                    int i3 = this.L;
                    if (z) {
                        this.L = i3 | i2;
                    } else {
                        this.L = i3 & (~i2);
                    }
                } else {
                    if (this.K) {
                        if (i == 1) {
                            int i4 = uc7.r5;
                            i2 = 1;
                            j = Long.MIN_VALUE;
                        } else if (i == 2) {
                            int i5 = uc7.r5;
                            i2 = 2;
                        } else if (i == 3) {
                            int i6 = uc7.r5;
                            j = -9223372036854775806L;
                            i2 = 4;
                        } else if (i == 4) {
                            int i7 = uc7.r5;
                            j = -9223372036854775805L;
                        } else {
                            int i8 = uc7.r5;
                            i2 = 16;
                            j = -9223372036854775804L;
                        }
                    } else if (i == 1) {
                        int i9 = uc7.r5;
                        i2 = 32;
                        j = -9223372036854775803L;
                    } else if (i == 2) {
                        int i10 = uc7.r5;
                        i2 = 64;
                        j = -9223372036854775802L;
                    } else {
                        int i11 = uc7.r5;
                        i2 = 128;
                        j = -9223372036854775801L;
                    }
                    og2 og2Var2 = bd5Var.d;
                    if (og2Var2 == null) {
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
                if (this.y == 1 && !xc2.y(13, chat)) {
                    xnb.x(null, 2131748053, d31.b0(this), null);
                    return;
                }
            }
            boolean z3 = zh6Var.h(j) >= 0;
            if (z3) {
                this.b.b((zc5) zh6Var.f(j));
            } else if ((!z2 && !getUserConfig().p() && this.x >= uc7.s1(this.currentAccount).k4.j1.f()) || this.x >= uc7.s1(this.currentAccount).k4.k1.f()) {
                l46 l46Var = new l46(4, this.currentAccount, null, context, this);
                l46Var.r2 = this.x;
                showDialog(l46Var);
                return;
            } else {
                if (object instanceof TLRPC.User) {
                    uc7.s1(this.currentAccount).i4((TLRPC.User) object, !this.O, false);
                } else if (object instanceof TLRPC.Chat) {
                    uc7.s1(this.currentAccount).a4((TLRPC.Chat) object, !this.O);
                }
                zc5 zc5Var = new zc5(this.c.getContext(), object);
                this.b.a(zc5Var, true);
                zc5Var.setOnClickListener(this);
            }
            c0();
            if (this.O || this.N) {
                hl.E3(this.c);
            } else {
                bd5Var.c(!z3, true);
            }
            if (this.c.length() > 0) {
                this.c.setText((CharSequence) null);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.Si));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.n6));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void b0() {
        zh6 zh6Var = this.P;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zh6Var.m(); i++) {
            if (zh6Var.j(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(zh6Var.j(i)));
            }
        }
        zbc zbcVar = this.n;
        if (zbcVar != null) {
            zbcVar.a(this.L, arrayList);
        }
        finishFragment();
    }

    public final void c0() {
        byte b = this.y;
        if (b == 0) {
            int f = (getUserConfig().p() ? getMessagesController().k4.k1 : getMessagesController().k4.j1).f();
            int i = this.x;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (i == 0) {
                aVar.setSubtitle(ob6.a0("MembersCountZero", null, 2131748373, ob6.G(f, "Chats", new Object[0])));
                return;
            } else {
                aVar.setSubtitle(String.format(ob6.J0(i, "MembersCountSelected"), Integer.valueOf(this.x), Integer.valueOf(f)));
                return;
            }
        }
        if (b == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            int i2 = this.x;
            jl jlVar = this.F;
            if (i2 == 0) {
                jlVar.getTitle().c(ob6.M0(2131745396, null), true, true);
                int i3 = this.T;
                jl jlVar2 = this.F;
                if (i3 > 0) {
                    jlVar2.getSubtitleTextView().c(ob6.M0(2131745395, null), true, true);
                    return;
                } else {
                    jlVar2.getSubtitleTextView().c(ob6.M0(2131745393, null), true, true);
                    return;
                }
            }
            in title = jlVar.getTitle();
            int i4 = this.x;
            title.setText(ob6.G(i4, "Chats", Integer.valueOf(i4)));
            int i5 = this.T;
            jl jlVar3 = this.F;
            if (i5 > 0) {
                jlVar3.getSubtitleTextView().setText(ob6.M0(2131745394, null));
            } else {
                jlVar3.getSubtitleTextView().setText(ob6.M0(2131745392, null));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        int i;
        final byte b = 0;
        this.O = false;
        this.N = false;
        this.Q.clear();
        this.P.b();
        vnb vnbVar = null;
        this.R = null;
        int i2 = 1;
        if (this.y == 1) {
            Activity parentActivity = getParentActivity();
            jl jlVar = new jl(parentActivity);
            jlVar.a = true;
            jlVar.b = hl.L(8.0f);
            in inVar = new in(parentActivity, true, true, true);
            jlVar.c = inVar;
            int i3 = aob.A8;
            yob.U(inVar, i3, null);
            inVar.setTextSize(hl.L(18.0f));
            inVar.setGravity(3);
            inVar.setTypeface(hl.o());
            inVar.setPadding(0, hl.L(6.0f), 0, hl.L(12.0f));
            jlVar.addView(inVar);
            in inVar2 = new in(parentActivity, true, true, true);
            jlVar.d = inVar2;
            inVar2.setTag(Integer.valueOf(aob.B8));
            yob.U(inVar2, i3, null);
            inVar2.setTextSize(hl.L(14.0f));
            inVar2.setGravity(3);
            inVar2.setPadding(0, 0, hl.L(10.0f), 0);
            jlVar.addView(inVar2);
            inVar.getDrawable().K = true;
            inVar2.getDrawable().K = true;
            k43 k43Var = k43.f;
            inVar.b(1.0f, 150L, k43Var);
            inVar2.b(1.0f, 150L, k43Var);
            jlVar.setClipChildren(false);
            this.F = jlVar;
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            boolean z = ob6.a0;
            aVar.addView(jlVar, tre.d(-1, -1.0f, 0, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        byte b2 = this.y;
        boolean z2 = this.K;
        byte b3 = 2;
        if (b2 == 0 || b2 == 2) {
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (z2) {
                aVar2.setTitle(ob6.M0(2131750770, null));
            } else {
                aVar2.setTitle(ob6.M0(2131750694, null));
            }
        } else if (b2 == 1) {
            c0();
        }
        this.actionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 27));
        t8 t8Var = new t8(this, context, b3);
        this.fragmentView = t8Var;
        yc ycVar = new yc(this, context, (byte) 6);
        this.a = ycVar;
        ycVar.setVerticalScrollBarEnabled(false);
        hl.u3(this.a, aob.w0(null, aob.d6, false));
        t8Var.addView(this.a);
        ccc cccVar = new ccc(this, context);
        this.b = cccVar;
        this.a.addView(cccVar, tre.c(-2.0f, -1));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: ybc
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
                        hl.E3(usersSelectActivity.c);
                        break;
                    default:
                        usersSelectActivity.b0();
                        break;
                }
            }
        });
        m7 m7Var = new m7((byte) 9, context, this);
        this.c = m7Var;
        m7Var.setTextSize(1, 16.0f);
        yob.A(this.c, aob.Oi, null);
        yob.X(this.c, aob.G6, null);
        yob.v(this.c, aob.Pi, null);
        this.c.setCursorWidth(1.5f);
        m7 m7Var2 = this.c;
        m7Var2.setInputType(m7Var2.getInputType() | jn7.F2);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        byte b4 = 16;
        this.c.setGravity((ob6.a0 ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(ob6.M0(2131745496, null));
        this.c.setCustomSelectionActionModeCallback(new ry7((byte) 4));
        final byte b5 = 1;
        this.c.setOnKeyListener(new jc5(this, b5));
        this.c.addTextChangedListener(new nh6(this, (byte) 23));
        tk4 tk4Var = new tk4(context, null);
        this.e = tk4Var;
        tk4Var.setViewType(10);
        tk4 tk4Var2 = this.e;
        tk4Var2.x = false;
        tk4Var2.setItemsCount(3);
        tk4 tk4Var3 = this.e;
        int i4 = aob.G8;
        int i5 = aob.i6;
        tk4Var3.e(i4, i5, i5);
        t8Var.addView(this.e);
        oc5 oc5Var = new oc5(context, this.e, i2, vnbVar, (byte) 2);
        this.f = oc5Var;
        oc5Var.e(lv2.r(this.currentAccount).y(), true);
        this.f.d.setText(ob6.M0(2131747954, null));
        t8Var.addView(this.f);
        x46 x46Var = new x46(1, false);
        d79 d79Var = new d79(context, null);
        this.d = d79Var;
        d79Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        d79 d79Var2 = this.d;
        bcc bccVar = new bcc(this, context);
        this.h = bccVar;
        d79Var2.setAdapter(bccVar);
        this.d.setLayoutManager(x46Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        this.d.i(new br1(b4));
        t8Var.addView(this.d);
        this.d.setOnItemClickListener(new l0(this, context, (byte) 24));
        this.d.setOnScrollListener(new qhb(this, (byte) 7));
        this.s = zp4.b();
        zp4 zp4Var = new zp4(this.resourceProvider, context, false);
        this.r = zp4Var;
        zp4Var.setImageResource(R.drawable.floating_check);
        t8Var.addView(this.r, this.s);
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: ybc
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
                        hl.E3(usersSelectActivity.c);
                        break;
                    default:
                        usersSelectActivity.b0();
                        break;
                }
            }
        });
        this.r.setContentDescription(ob6.M0(2131747981, null));
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
                    int i8 = uc7.r5;
                    i = 1;
                    str = "contacts";
                } else if (i7 == 2) {
                    int i9 = uc7.r5;
                    i = 2;
                } else if (i7 == 3) {
                    int i10 = uc7.r5;
                    str = "groups";
                    i = 4;
                } else if (i7 == 4) {
                    int i11 = uc7.r5;
                    str = "channels";
                    i = 8;
                } else {
                    int i12 = uc7.r5;
                    str = "bots";
                    i = 16;
                }
            } else if (i7 == 1) {
                int i13 = uc7.r5;
                str = "muted";
                i = 32;
            } else if (i7 == 2) {
                int i14 = uc7.r5;
                str = "read";
                i = 64;
            } else {
                int i15 = uc7.r5;
                str = "archived";
                i = 128;
            }
            if ((this.L & i) != 0) {
                zc5 zc5Var = new zc5(this.c.getContext(), str);
                this.b.a(zc5Var, false);
                zc5Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Long l = (Long) arrayList.get(i16);
                Object X1 = l.longValue() > 0 ? getMessagesController().X1(l) : getMessagesController().M0(Long.valueOf(-l.longValue()));
                if (X1 != null) {
                    zc5 zc5Var2 = new zc5(this.c.getContext(), X1);
                    this.b.a(zc5Var2, false);
                    zc5Var2.setOnClickListener(this);
                }
            }
        }
        c0();
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.N) {
            oc5 oc5Var = this.f;
            if (oc5Var != null) {
                oc5Var.e(false, true);
            }
            bcc bccVar = this.h;
            if (bccVar != null) {
                bccVar.f();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == jn7.R) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            int i3 = uc7.r5;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.d.getChildAt(i4);
                if (childAt instanceof bd5) {
                    ((bd5) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.E;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Oi));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.Ri));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.i7));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.j7));
        arrayList.add(new apb(this.d, 4, new Class[]{bd5.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        arrayList.add(new apb(this.b, 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ti));
        arrayList.add(new apb(this.b, 0, new Class[]{zc5.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ui));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zc5 zc5Var = (zc5) view;
        if (!zc5Var.E) {
            zc5 zc5Var2 = this.R;
            if (zc5Var2 != null) {
                zc5Var2.a();
            }
            this.R = zc5Var;
            zc5Var.b();
            return;
        }
        this.R = null;
        this.b.b(zc5Var);
        if (this.y == 2) {
            if (zc5Var.getUid() == -9223372036854775800L) {
                this.L &= -2;
            } else if (zc5Var.getUid() == -9223372036854775799L) {
                this.L &= -3;
            } else if (zc5Var.getUid() == Long.MIN_VALUE) {
                this.L &= -5;
            } else if (zc5Var.getUid() == -9223372036854775807L) {
                this.L &= -9;
            }
        } else if (zc5Var.getUid() == Long.MIN_VALUE) {
            int i = this.L;
            int i2 = uc7.r5;
            this.L = i & (-2);
        } else if (zc5Var.getUid() == -9223372036854775807L) {
            int i3 = this.L;
            int i4 = uc7.r5;
            this.L = i3 & (-3);
        } else if (zc5Var.getUid() == -9223372036854775806L) {
            int i5 = this.L;
            int i6 = uc7.r5;
            this.L = i5 & (-5);
        } else if (zc5Var.getUid() == -9223372036854775805L) {
            int i7 = this.L;
            int i8 = uc7.r5;
            this.L = i7 & (-9);
        } else if (zc5Var.getUid() == -9223372036854775804L) {
            int i9 = this.L;
            int i10 = uc7.r5;
            this.L = i9 & (-17);
        } else if (zc5Var.getUid() == -9223372036854775803L) {
            int i11 = this.L;
            int i12 = uc7.r5;
            this.L = i11 & (-33);
        } else if (zc5Var.getUid() == -9223372036854775802L) {
            int i13 = this.L;
            int i14 = uc7.r5;
            this.L = i13 & (-65);
        } else if (zc5Var.getUid() == -9223372036854775801L) {
            int i15 = this.L;
            int i16 = uc7.r5;
            this.L = i15 & (-129);
        }
        c0();
        Z();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.N);
        jn7.f(this.currentAccount).b(this, 2);
        jn7.f(this.currentAccount).b(this, jn7.R);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.N);
        jn7.f(this.currentAccount).n(this, 2);
        jn7.f(this.currentAccount).n(this, jn7.R);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.requestFocus();
        }
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            m7 m7Var = this.c;
            if (m7Var != null) {
                yob.l(m7Var, 34, aob.Oi, null);
                yob.v(this.c, aob.Pi, null);
            }
            d79 d79Var = this.d;
            if (d79Var != null) {
                d79Var.y1();
            }
            yc ycVar = this.a;
            if (ycVar != null) {
                hl.u3(ycVar, aob.w0(null, aob.d6, false));
            }
            if (this.b != null) {
                for (int i = 0; i < this.b.getChildCount(); i++) {
                    View childAt = this.b.getChildAt(i);
                    if (childAt instanceof zc5) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void setContainerHeight(int i) {
        this.E = i;
        ccc cccVar = this.b;
        if (cccVar != null) {
            cccVar.requestLayout();
        }
    }
}
