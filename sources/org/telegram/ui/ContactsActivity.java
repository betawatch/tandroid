package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.d implements x74, gk7, zg6, swc {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public long S;
    public String T;
    public boolean U;
    public rt2 V;
    public String W;
    public hd X;
    public boolean Y;
    public boolean Z;
    public final y74 a;
    public final vf6 a0;
    public ot2 b;
    public xha b0;
    public zya c;
    public String c0;
    public o39 d;
    public boolean d0;
    public cu6 e;
    public long e0;
    public t26 f;
    public ViewPropertyAnimator f0;
    public boolean g0;
    public nt2 h;
    public final o1 h0;
    public int i0;
    public int j0;
    public float k0;
    public int l0;
    public int m0;
    public xha n;
    public boolean n0;
    public boolean o0;
    public int phonebookRow;
    public boolean r;
    public un4 s;
    public boolean w;
    public n81 x;
    public boolean y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.a = new y74(0, this, s33.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.w = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = null;
        this.U = true;
        this.Y = true;
        this.a0 = new vf6();
        this.d0 = true;
        this.h0 = new o1(this, (byte) 19);
    }

    @Override // zg6
    public final lx4 A() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override // swc
    public final View R() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d, zg6
    public final boolean W(MotionEvent motionEvent, boolean z) {
        o39 o39Var = this.d;
        return o39Var == null || o39Var.getFastScroll() == null || !this.d.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.o6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.z9));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void b0(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !y6c.h(this.currentAccount).V || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z && this.Y) {
            showDialog(ij.v(parentActivity, new jt2(this, (byte) 1)).a);
            return;
        }
        this.e0 = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void c0() {
        zya zyaVar = this.c;
        if (zyaVar != null) {
            zyaVar.b(Math.max(this.l0 + this.i0, this.m0), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        int i2;
        String str;
        LaunchActivity launchActivity;
        this.E = false;
        this.y = false;
        if (this.I) {
            boolean z = this.J;
            pha phaVar = this.simpleActionBar;
            if (z) {
                phaVar.setTitle(k96.M0(2131745469, null));
            } else {
                phaVar.setTitle(k96.M0(this.K ? 2131748071 : 2131748078, null));
            }
        } else {
            this.simpleActionBar.setTitle(k96.M0(2131751768, null));
        }
        if (!this.H) {
            this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        }
        this.simpleActionBar.q().c(100, R.drawable.msg_delete, gl.L(54.0f), k96.M0(2131751586, null));
        byte b = 6;
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, b));
        wha t = this.simpleActionBar.t();
        xha a = t.a(0, R.drawable.outline_header_search);
        this.b0 = a;
        a.setContentDescription(k96.M0(2131745620, null));
        xha xhaVar = this.b0;
        xhaVar.N();
        byte b2 = 7;
        xhaVar.C0 = new q10(this, b2);
        byte b3 = 1;
        if (!this.K && !this.J) {
            xha a2 = t.a(1, this.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.n = a2;
            a2.setContentDescription(k96.M0(2131754891, null));
        }
        this.d = new o39(context, null);
        this.h = new nt2(this, context, this.a0, this.U, this.N, this.M);
        int i3 = 2;
        if (this.S != 0) {
            i2 = hc2.y(3, getMessagesController().K0(Long.valueOf(this.S)));
        } else {
            if (this.R == 0) {
                i = 0;
                ot2 ot2Var = new ot2(this, context, this.F ? 1 : 0, this.G, this.a0, i);
                this.b = ot2Var;
                if (this.n != null) {
                    i3 = 0;
                } else if (this.r) {
                    i3 = 1;
                }
                ot2Var.Y(i3, false);
                ot2 ot2Var2 = this.b;
                ot2Var2.N = 17.0f;
                ot2Var2.I = this.Z;
                n81 n81Var = new n81(b3, context, this);
                this.x = n81Var;
                this.fragmentView = n81Var;
                this.d.r1();
                zkb.h(bkb.Z6, getResourceProvider(), this.x);
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setViewType(29);
                pi4Var.x = false;
                zya zyaVar = new zya(context, pi4Var, 1, null);
                this.c = zyaVar;
                zyaVar.addView(pi4Var, 0);
                this.c.setAnimateLayoutChange(true);
                this.c.e(true, false);
                this.c.d.setText(k96.M0(2131747975, null));
                this.c.e.setText(k96.M0(2131745615, null));
                this.x.addView(this.c, nme.d(-1, -1.0f, kk7.D1, 12.0f, 12.0f, 12.0f, 0.0f));
                gb3 gb3Var = new gb3();
                gb3Var.C = false;
                gb3Var.n(150L);
                gb3Var.m = false;
                this.d.setItemAnimator(gb3Var);
                this.d.setSectionsType(1);
                this.d.setVerticalScrollBarEnabled(false);
                this.d.setFastScrollEnabled(0);
                o39 o39Var = this.d;
                t26 t26Var = new t26(1, false);
                this.f = t26Var;
                o39Var.setLayoutManager(t26Var);
                this.d.setAdapter(this.b);
                this.d.setClipToPadding(false);
                this.e = new cu6(this.d, this.f);
                this.x.addView(this.d, nme.c(-1.0f, -1));
                this.d.setEmptyView(this.c);
                o39 o39Var2 = this.d;
                o39Var2.X1 = true;
                o39Var2.Y1 = false;
                o39Var2.setOnItemClickListener(new jh(this, i, b));
                this.d.setOnItemLongClickListener(new mt2(this));
                this.d.setOnScrollListener(new pt2(this));
                if (!this.K && !this.J) {
                    un4 un4Var = new un4(this.resourceProvider, context, false);
                    this.s = un4Var;
                    this.x.addView(un4Var, un4.b());
                    this.s.setOnClickListener(new x91(this, (byte) 19));
                    this.s.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
                    this.s.c.getAnimatedDrawable().H(this.s.c.getAnimatedDrawable().e[0] - 1);
                    this.s.setContentDescription(k96.M0(2131751705, null));
                }
                str = this.W;
                if (str != null) {
                    pha phaVar2 = this.simpleActionBar;
                    if (phaVar2.C(true, false)) {
                        phaVar2.setSearchFieldText(str);
                    }
                    this.W = null;
                }
                f0();
                setBulletinDelegate(new s10(this, b2));
                launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.g1.d.add(this);
                }
                View view = this.fragmentView;
                mt2 mt2Var = new mt2(this);
                WeakHashMap weakHashMap = jdc.a;
                bdc.i(view, mt2Var);
                return this.fragmentView;
            }
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.R));
            i2 = (!hc2.y(3, K0) || hc2.t0(K0)) ? 0 : 2;
        }
        i = i2;
        ot2 ot2Var3 = new ot2(this, context, this.F ? 1 : 0, this.G, this.a0, i);
        this.b = ot2Var3;
        if (this.n != null) {
        }
        ot2Var3.Y(i3, false);
        ot2 ot2Var22 = this.b;
        ot2Var22.N = 17.0f;
        ot2Var22.I = this.Z;
        n81 n81Var2 = new n81(b3, context, this);
        this.x = n81Var2;
        this.fragmentView = n81Var2;
        this.d.r1();
        zkb.h(bkb.Z6, getResourceProvider(), this.x);
        pi4 pi4Var2 = new pi4(context, null);
        pi4Var2.setViewType(29);
        pi4Var2.x = false;
        zya zyaVar2 = new zya(context, pi4Var2, 1, null);
        this.c = zyaVar2;
        zyaVar2.addView(pi4Var2, 0);
        this.c.setAnimateLayoutChange(true);
        this.c.e(true, false);
        this.c.d.setText(k96.M0(2131747975, null));
        this.c.e.setText(k96.M0(2131745615, null));
        this.x.addView(this.c, nme.d(-1, -1.0f, kk7.D1, 12.0f, 12.0f, 12.0f, 0.0f));
        gb3 gb3Var2 = new gb3();
        gb3Var2.C = false;
        gb3Var2.n(150L);
        gb3Var2.m = false;
        this.d.setItemAnimator(gb3Var2);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        o39 o39Var3 = this.d;
        t26 t26Var2 = new t26(1, false);
        this.f = t26Var2;
        o39Var3.setLayoutManager(t26Var2);
        this.d.setAdapter(this.b);
        this.d.setClipToPadding(false);
        this.e = new cu6(this.d, this.f);
        this.x.addView(this.d, nme.c(-1.0f, -1));
        this.d.setEmptyView(this.c);
        o39 o39Var22 = this.d;
        o39Var22.X1 = true;
        o39Var22.Y1 = false;
        o39Var22.setOnItemClickListener(new jh(this, i, b));
        this.d.setOnItemLongClickListener(new mt2(this));
        this.d.setOnScrollListener(new pt2(this));
        if (!this.K) {
            un4 un4Var2 = new un4(this.resourceProvider, context, false);
            this.s = un4Var2;
            this.x.addView(un4Var2, un4.b());
            this.s.setOnClickListener(new x91(this, (byte) 19));
            this.s.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.s.c.getAnimatedDrawable().H(this.s.c.getAnimatedDrawable().e[0] - 1);
            this.s.setContentDescription(k96.M0(2131751705, null));
        }
        str = this.W;
        if (str != null) {
        }
        f0();
        setBulletinDelegate(new s10(this, b2));
        launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
        }
        View view2 = this.fragmentView;
        mt2 mt2Var2 = new mt2(this);
        WeakHashMap weakHashMap2 = jdc.a;
        bdc.i(view2, mt2Var2);
        return this.fragmentView;
    }

    public final void d0() {
        un4 un4Var = this.s;
        if (un4Var != null) {
            un4Var.setTranslationY(((-this.l0) - this.j0) - this.k0);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        o39 o39Var;
        if (i == kk7.N) {
            ot2 ot2Var = this.b;
            if (ot2Var != null) {
                if (!this.r) {
                    ot2Var.Y(2, true);
                }
                this.b.f();
            }
            if (this.h != null) {
                w39 adapter = this.d.getAdapter();
                nt2 nt2Var = this.h;
                if (adapter == nt2Var) {
                    nt2Var.G(this.c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2) {
            int i3 = kk7.Z;
            int i4 = kk7.s;
            if (i != i3) {
                if (i != i4 || this.L) {
                    return;
                }
                removeSelfFromStack(true);
                return;
            }
            if (this.K && this.L) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                kk7.f(this.currentAccount).k(i4, new Object[0]);
                presentFragment(new mu1(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i5 = na7.q5;
        if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (o39Var = this.d) != null) {
            int childCount = o39Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.d.getChildAt(i6);
                if (childAt instanceof v6c) {
                    ((v6c) childAt).i(intValue);
                }
            }
        }
        int i7 = na7.q5;
        if ((intValue & 4) == 0 || this.r || this.b == null || this.g0) {
            return;
        }
        this.g0 = true;
        o1 o1Var = this.h0;
        gl.r(o1Var);
        gl.e3(o1Var, 5000L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return !this.H;
    }

    public final void e0() {
        ot2 ot2Var;
        un4 un4Var = this.s;
        if (un4Var == null || (ot2Var = this.b) == null) {
            return;
        }
        un4Var.e((!this.w || this.E || ot2Var.J) ? false : true, true);
    }

    public final void f0() {
        ot2 ot2Var = this.b;
        boolean z = ot2Var != null && ot2Var.J;
        if (this.n0 == z && this.o0) {
            return;
        }
        this.b0.setSearchFieldHint(k96.M0(z ? 2131745542 : 2131745620, null));
        this.n0 = z;
        this.o0 = true;
    }

    public final void g0(TLRPC.User user, boolean z, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z || this.T == null) {
            rt2 rt2Var = this.V;
            if (rt2Var != null) {
                rt2Var.b(user);
                if (this.Q) {
                    this.V = null;
                }
            }
            if (this.P) {
                finishFragment();
                return;
            }
            return;
        }
        if (getParentActivity() != null) {
            if (user.bot) {
                if (user.bot_nochats) {
                    try {
                        u21.b0(this).t(k96.M0(2131753105, null), null).j();
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                if (this.R != 0) {
                    TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.R));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    boolean w = hc2.w(4, K0);
                    hd hdVar = alertDialog$Builder.a;
                    if (w) {
                        hdVar.S = k96.M0(2131754458, null);
                        hdVar.U = k96.M0(2131754457, null);
                        alertDialog$Builder.j(k96.M0(2131754463, null), new v82(this, user, str));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    } else {
                        hdVar.U = k96.M0(2131752554, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    }
                    showDialog(hdVar);
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(R.string.AppName, null);
            hd hdVar2 = alertDialog$Builder2.a;
            hdVar2.S = M0;
            byte b = 0;
            String b0 = k96.b0(this.T, l7c.q(user));
            if (user.bot || !this.O) {
                editTextBoldCursor = null;
            } else {
                b0 = tb4.y(b0, "\n\n", k96.M0(2131754362, null));
                editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setText("50");
                zkb.X(editTextBoldCursor, bkb.i5, getResourceProvider());
                editTextBoldCursor.setGravity(17);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setBackground(bkb.T(getParentActivity()));
                editTextBoldCursor.addTextChangedListener(new qt2(editTextBoldCursor));
                alertDialog$Builder2.n(editTextBoldCursor);
            }
            hdVar2.U = b0;
            alertDialog$Builder2.j(k96.M0(2131747638, null), new lt2(this, user, editTextBoldCursor, b));
            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
            showDialog(hdVar2);
            if (editTextBoldCursor != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                if (marginLayoutParams != null) {
                    if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                    }
                    int L = gl.L(24.0f);
                    marginLayoutParams.leftMargin = L;
                    marginLayoutParams.rightMargin = L;
                    marginLayoutParams.height = gl.L(36.0f);
                    editTextBoldCursor.setLayoutParams(marginLayoutParams);
                }
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 3);
        if (!this.H) {
            arrayList.add(new blb(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        }
        arrayList.add(new blb(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.d, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        arrayList.add(new blb(this.d, 262148, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.n6));
        un4 un4Var = this.s;
        if (un4Var != null) {
            arrayList.add(new blb(un4Var.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.O9));
            arrayList.add(new blb(this.s.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.P9));
        }
        return arrayList;
    }

    public final void h0() {
        this.simpleActionBar.w();
        int childCount = this.d.getChildCount();
        int i = 0;
        while (true) {
            vf6 vf6Var = this.a0;
            if (i >= childCount) {
                vf6Var.b();
                return;
            }
            View childAt = this.d.getChildAt(i);
            if (childAt instanceof v6c) {
                v6c v6cVar = (v6c) childAt;
                if (vf6Var.h(v6cVar.getDialogId()) >= 0) {
                    v6cVar.c(false, true);
                }
            } else if (childAt instanceof rr8) {
                rr8 rr8Var = (rr8) childAt;
                if (vf6Var.h(rr8Var.getDialogId()) >= 0) {
                    rr8Var.y(false, true);
                }
            }
            i++;
        }
    }

    public final /* synthetic */ void i0(int i) {
        na7.d1().edit().putBoolean("askAboutContacts2", false).commit();
        kk7.f(this.currentAccount).k(kk7.R5, new Object[0]);
        this.Y = i != 0;
        if (i == 0) {
            return;
        }
        b0(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // zg6
    public final lx4 j() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void j0(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", qu2.r(this.currentAccount).s(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void k0(View view, int i, int i2) {
        w39 adapter = this.d.getAdapter();
        nt2 nt2Var = this.h;
        vf6 vf6Var = this.a0;
        if (adapter == nt2Var) {
            nt2Var.getClass();
            Object E = this.h.E(i2);
            if (!vf6Var.i() && (view instanceof rr8)) {
                rr8 rr8Var = (rr8) view;
                if (rr8Var.getUser() == null || !rr8Var.getUser().contact) {
                    return;
                }
                m0(rr8Var);
                return;
            }
            if (!(E instanceof TLRPC.User)) {
                if (!(E instanceof String)) {
                    if (E instanceof nu2) {
                        nu2 nu2Var = (nu2) E;
                        ij.u(this, nu2Var.i, nu2Var.j, (String) nu2Var.e.get(0));
                        return;
                    }
                    return;
                }
                String str = (String) E;
                if (str.equals("section")) {
                    return;
                }
                if (na7.q1(this.currentAccount).t2()) {
                    h5.b(this.currentAccount);
                    return;
                }
                jj7 jj7Var = new jj7(this, getParentActivity());
                jj7Var.H0(str, true);
                jj7Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            nt2 nt2Var2 = this.h;
            int size = nt2Var2.d.size();
            int size2 = nt2Var2.I.size();
            zr9 zr9Var = nt2Var2.f;
            int size3 = zr9Var.e.size();
            int size4 = zr9Var.j.size();
            if ((i2 < 0 || i2 >= size) && ((i2 <= size || i2 >= size + size2 + 1) && ((i2 <= size + size2 + 1 || i2 >= size + size4 + size2 + 1) && i2 > size + size4 + size2 + 1 && i2 <= size3 + size4 + size + size2 + 1))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                getMessagesController().a4(arrayList, false);
                ad7.Y(this.currentAccount).j1(arrayList, null, false, true);
            }
            if (this.J) {
                g0(user, true, null);
                return;
            }
            if (this.K) {
                if (user.id != y6c.h(this.currentAccount).e()) {
                    this.L = true;
                    bu9.i(this.currentAccount).A(getParentActivity(), user);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            if (getMessagesController().A(bundle, this, null, null)) {
                presentFragment(new mu1(bundle), this.P);
                return;
            }
            return;
        }
        this.b.getClass();
        int S = this.b.S(i2);
        int Q = this.b.Q(i2);
        if (Q < 0 || S < 0) {
            return;
        }
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof ru2)) {
            un4 un4Var = this.s;
            if (un4Var != null) {
                un4Var.performClick();
                return;
            }
            return;
        }
        if (!vf6Var.i() && (view instanceof v6c)) {
            m0((v6c) view);
            return;
        }
        if ((this.F && i == 0) || S != 0) {
            Object O = this.b.O(this.b.S(i2), this.b.Q(i2));
            if (O instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) O;
                if (this.J) {
                    g0(user2, true, null);
                    return;
                }
                if (this.K) {
                    this.L = true;
                    bu9.i(this.currentAccount).A(getParentActivity(), user2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                if (getMessagesController().A(bundle2, this, null, null)) {
                    presentFragment(new mu1(bundle2), this.P);
                    return;
                }
                return;
            }
            if (O instanceof nu2) {
                ArrayList arrayList2 = ((nu2) O).e;
                String str2 = !arrayList2.isEmpty() ? (String) arrayList2.get(0) : null;
                if (str2 == null || getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131748914, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.U = M0;
                hdVar.S = k96.M0(R.string.AppName, null);
                alertDialog$Builder.j(k96.M0(2131747638, null), new v82((Object) this, (Object) str2, (byte) 10));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                return;
            }
            return;
        }
        if (this.G) {
            if (Q != 0) {
                if (Q == 1) {
                    presentFragment(new z81(null));
                    return;
                }
                return;
            } else if (na7.q1(this.currentAccount).t2()) {
                h5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new gq5());
                return;
            }
        }
        if (i != 0) {
            if (Q == 0) {
                if (na7.q1(this.currentAccount).t2()) {
                    h5.b(this.currentAccount);
                    return;
                }
                long j = this.S;
                if (j == 0) {
                    j = this.R;
                }
                bb5 bb5Var = new bb5(null);
                bb5Var.d = j;
                presentFragment(bb5Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (na7.q1(this.currentAccount).t2()) {
                h5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new qa5(new Bundle()), false);
                return;
            }
        }
        if (Q == 1) {
            if (na7.q1(this.currentAccount).t2()) {
                h5.b(this.currentAccount);
                return;
            }
            SharedPreferences c1 = na7.c1();
            boolean z = w01.a;
            presentFragment(new u8(0));
            c1.edit().putBoolean("channel_intro", true).commit();
        }
    }

    public final void l0() {
        if (na7.q1(this.currentAccount).t2()) {
            h5.b(this.currentAccount);
        } else {
            new jj7(this, getParentActivity()).show();
        }
    }

    public final void m0(ViewGroup viewGroup) {
        boolean z;
        boolean z2 = viewGroup instanceof v6c;
        boolean z3 = true;
        vf6 vf6Var = this.a0;
        if (z2) {
            v6c v6cVar = (v6c) viewGroup;
            long dialogId = v6cVar.getDialogId();
            if (vf6Var.h(dialogId) >= 0) {
                vf6Var.l(dialogId);
                v6cVar.c(false, true);
            } else if (v6cVar.getCurrentObject() instanceof TLRPC.User) {
                vf6Var.k((TLRPC.User) v6cVar.getCurrentObject(), dialogId);
                v6cVar.c(true, true);
                z = true;
            }
            z = false;
        } else {
            if (!(viewGroup instanceof rr8)) {
                return;
            }
            rr8 rr8Var = (rr8) viewGroup;
            long dialogId2 = rr8Var.getDialogId();
            if (vf6Var.h(dialogId2) >= 0) {
                vf6Var.l(dialogId2);
                rr8Var.y(false, true);
            } else if (rr8Var.getUser() != null) {
                vf6Var.k(rr8Var.getUser(), dialogId2);
                rr8Var.y(true, true);
                z = true;
            }
            z = false;
        }
        if (!this.simpleActionBar.x()) {
            if (z) {
                gl.t1(this.fragmentView.findFocus());
                this.simpleActionBar.F(vf6Var.m(), false);
                this.simpleActionBar.J();
            }
            z3 = false;
        } else if (vf6Var.i()) {
            h0();
            return;
        }
        this.simpleActionBar.F(vf6Var.m(), z3);
    }

    @Override // swc
    public final void o(vxc vxcVar) {
        this.m0 = vxcVar.a.f(8).d;
        c0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!this.simpleActionBar.x()) {
            pha phaVar = this.simpleActionBar;
            if (!phaVar.G) {
                return super.onBackPressed(z);
            }
            if (z) {
                phaVar.n(true);
            }
        } else if (z) {
            h0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (!this.d0 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.d0 = false;
        if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (!parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                b0(true);
                return;
            }
            hd hdVar = ij.v(parentActivity, new jt2(this, (byte) 0)).a;
            this.X = hdVar;
            showDialog(hdVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        hd hdVar = this.X;
        if (hdVar == null || dialog != hdVar || getParentActivity() == null || !this.Y) {
            return;
        }
        b0(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        kk7.f(this.currentAccount).b(this, kk7.N);
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.Z);
        kk7.f(this.currentAccount).b(this, kk7.s);
        this.d0 = y6c.h(this.currentAccount).V;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.F = bundle.getBoolean("onlyUsers", false);
            this.I = this.arguments.getBoolean("destroyAfterSelect", false);
            this.J = this.arguments.getBoolean("returnAsResult", false);
            this.K = this.arguments.getBoolean("createSecretChat", false);
            this.T = this.arguments.getString("selectAlertString");
            this.U = this.arguments.getBoolean("allowUsernameSearch", true);
            this.O = this.arguments.getBoolean("needForwardCount", true);
            this.N = this.arguments.getBoolean("allowBots", true);
            this.M = this.arguments.getBoolean("allowSelf", true);
            this.R = this.arguments.getLong("channelId", 0L);
            this.P = this.arguments.getBoolean("needFinishFragment", true);
            this.S = this.arguments.getLong("chat_id", 0L);
            this.Z = this.arguments.getBoolean("disableSections", false);
            this.Q = this.arguments.getBoolean("resetDelegate", false);
            this.G = this.arguments.getBoolean("needPhonebook", false);
            this.H = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.G = true;
        }
        if (!this.K && !this.J) {
            this.r = gba.I0;
        }
        getContactsController().f();
        getContactsController().J(false);
        this.i0 = this.H ? gl.L(72.0f) : 0;
        this.j0 = this.H ? gl.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.N);
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.Z);
        kk7.f(this.currentAccount).n(this, kk7.s);
        this.V = null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.l0 = i4;
        dg0.e(this.d, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), this.i0);
        d0();
        c0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.n(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr.length > i2 && "android.permission.READ_CONTACTS".equals(strArr[i2])) {
                    if (iArr[i2] == 0) {
                        qu2.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = na7.d1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.a.b.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        ot2 ot2Var = this.b;
        if (ot2Var != null) {
            ot2Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                o39 o39Var = this.d;
                if (o39Var != null) {
                    o39Var.x1();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            ot2 ot2Var = this.b;
            ArrayList arrayList = ot2Var.O;
            ot2Var.M = f;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((p06) arrayList.get(i2)).setLetterProgress(f);
            }
            this.d.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // zg6
    public final void v() {
        if (this.f.K0() < 15) {
            this.d.z0(0);
            return;
        }
        cu6 cu6Var = this.e;
        cu6Var.b = 1;
        cu6Var.k(0, 0, false, false);
    }

    @Override // swc
    public final void P() {
    }

    @Override // swc
    public final void w() {
    }

    @Override // x74
    public final void D(float f, int i) {
    }
}
