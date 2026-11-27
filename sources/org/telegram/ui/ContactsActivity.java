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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.e implements s84, fn7, ej6, i1d {
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
    public lu2 V;
    public String W;
    public id X;
    public boolean Y;
    public boolean Z;
    public final t84 a;
    public final zh6 a0;
    public iu2 b;
    public sla b0;
    public z2b c;
    public String c0;
    public d79 d;
    public boolean d0;
    public hw6 e;
    public long e0;
    public x46 f;
    public ViewPropertyAnimator f0;
    public boolean g0;
    public hu2 h;
    public final p1 h0;
    public int i0;
    public int j0;
    public float k0;
    public int l0;
    public int m0;
    public sla n;
    public boolean n0;
    public boolean o0;
    public int phonebookRow;
    public boolean r;
    public zp4 s;
    public boolean w;
    public w81 x;
    public boolean y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.a = new t84(0, this, k43.h, 380L, 1.0f);
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
        this.a0 = new zh6();
        this.d0 = true;
        this.h0 = new p1(this, (byte) 19);
    }

    @Override // ej6
    public final rz4 A() {
        return getBaseSimpleGlass().d();
    }

    @Override // i1d
    public final View R() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e, ej6
    public final boolean W(MotionEvent motionEvent, boolean z) {
        d79 d79Var = this.d;
        return d79Var == null || d79Var.getFastScroll() == null || !this.d.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.p6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.A9));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void b0(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !yac.h(this.currentAccount).V || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z && this.Y) {
            showDialog(jj.v(parentActivity, new du2(this, (byte) 1)).a);
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
            cc4.g(e, true);
        }
    }

    public final void c0() {
        z2b z2bVar = this.c;
        if (z2bVar != null) {
            z2bVar.b(Math.max(this.l0 + this.i0, this.m0), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    @Override // org.telegram.ui.ActionBar.e
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
            jla jlaVar = this.simpleActionBar;
            if (z) {
                jlaVar.setTitle(ob6.M0(2131745389, null));
            } else {
                jlaVar.setTitle(ob6.M0(this.K ? 2131748017 : 2131748024, null));
            }
        } else {
            this.simpleActionBar.setTitle(ob6.M0(2131751745, null));
        }
        if (!this.H) {
            this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        }
        this.simpleActionBar.r().c(100, R.drawable.msg_delete, hl.L(54.0f), ob6.M0(2131751563, null));
        byte b = 7;
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, b));
        rla v = this.simpleActionBar.v();
        sla a = v.a(0, R.drawable.outline_header_search);
        this.b0 = a;
        a.setContentDescription(ob6.M0(2131745540, null));
        sla slaVar = this.b0;
        slaVar.N();
        slaVar.C0 = new r10(this, b);
        byte b2 = 1;
        if (!this.K && !this.J) {
            sla a2 = v.a(1, this.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.n = a2;
            a2.setContentDescription(ob6.M0(2131754887, null));
        }
        this.d = new d79(context, null);
        this.h = new hu2(this, context, this.a0, this.U, this.N, this.M);
        int i3 = 2;
        if (this.S != 0) {
            i2 = xc2.y(3, getMessagesController().M0(Long.valueOf(this.S)));
        } else {
            if (this.R == 0) {
                i = 0;
                iu2 iu2Var = new iu2(this, context, this.F ? 1 : 0, this.G, this.a0, i);
                this.b = iu2Var;
                if (this.n != null) {
                    i3 = 0;
                } else if (this.r) {
                    i3 = 1;
                }
                iu2Var.Y(i3, false);
                iu2 iu2Var2 = this.b;
                iu2Var2.N = 17.0f;
                iu2Var2.I = this.Z;
                w81 w81Var = new w81(b2, context, this);
                this.x = w81Var;
                this.fragmentView = w81Var;
                this.d.s1();
                yob.h(aob.a7, getResourceProvider(), this.x);
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setViewType(29);
                tk4Var.x = false;
                z2b z2bVar = new z2b(context, tk4Var, 1, null);
                this.c = z2bVar;
                z2bVar.addView(tk4Var, 0);
                this.c.setAnimateLayoutChange(true);
                this.c.e(true, false);
                this.c.d.setText(ob6.M0(2131747898, null));
                this.c.e.setText(ob6.M0(2131745535, null));
                this.x.addView(this.c, tre.d(-1, -1.0f, jn7.D1, 12.0f, 12.0f, 12.0f, 0.0f));
                zb3 zb3Var = new zb3();
                zb3Var.C = false;
                zb3Var.n(150L);
                zb3Var.m = false;
                this.d.setItemAnimator(zb3Var);
                this.d.setSectionsType(1);
                this.d.setVerticalScrollBarEnabled(false);
                this.d.setFastScrollEnabled(0);
                d79 d79Var = this.d;
                x46 x46Var = new x46(1, false);
                this.f = x46Var;
                d79Var.setLayoutManager(x46Var);
                this.d.setAdapter(this.b);
                this.d.setClipToPadding(false);
                this.e = new hw6(this.d, this.f);
                this.x.addView(this.d, tre.c(-1.0f, -1));
                this.d.setEmptyView(this.c);
                d79 d79Var2 = this.d;
                d79Var2.X1 = true;
                d79Var2.Y1 = false;
                d79Var2.setOnItemClickListener(new wg((Object) this, i, (byte) 6));
                this.d.setOnItemLongClickListener(new gu2(this));
                this.d.setOnScrollListener(new ju2(this));
                if (!this.K && !this.J) {
                    zp4 zp4Var = new zp4(this.resourceProvider, context, false);
                    this.s = zp4Var;
                    this.x.addView(zp4Var, zp4.b());
                    this.s.setOnClickListener(new r81(this, (byte) 21));
                    this.s.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
                    this.s.c.getAnimatedDrawable().H(this.s.c.getAnimatedDrawable().e[0] - 1);
                    this.s.setContentDescription(ob6.M0(2131751682, null));
                }
                str = this.W;
                if (str != null) {
                    jla jlaVar2 = this.simpleActionBar;
                    if (jlaVar2.F(true, false)) {
                        jlaVar2.setSearchFieldText(str);
                    }
                    this.W = null;
                }
                f0();
                setBulletinDelegate(new t10(this, b));
                launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.g1.d.add(this);
                }
                View view = this.fragmentView;
                gu2 gu2Var = new gu2(this);
                WeakHashMap weakHashMap = ihc.a;
                ahc.i(view, gu2Var);
                return this.fragmentView;
            }
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.R));
            i2 = (!xc2.y(3, M0) || xc2.t0(M0)) ? 0 : 2;
        }
        i = i2;
        iu2 iu2Var3 = new iu2(this, context, this.F ? 1 : 0, this.G, this.a0, i);
        this.b = iu2Var3;
        if (this.n != null) {
        }
        iu2Var3.Y(i3, false);
        iu2 iu2Var22 = this.b;
        iu2Var22.N = 17.0f;
        iu2Var22.I = this.Z;
        w81 w81Var2 = new w81(b2, context, this);
        this.x = w81Var2;
        this.fragmentView = w81Var2;
        this.d.s1();
        yob.h(aob.a7, getResourceProvider(), this.x);
        tk4 tk4Var2 = new tk4(context, null);
        tk4Var2.setViewType(29);
        tk4Var2.x = false;
        z2b z2bVar2 = new z2b(context, tk4Var2, 1, null);
        this.c = z2bVar2;
        z2bVar2.addView(tk4Var2, 0);
        this.c.setAnimateLayoutChange(true);
        this.c.e(true, false);
        this.c.d.setText(ob6.M0(2131747898, null));
        this.c.e.setText(ob6.M0(2131745535, null));
        this.x.addView(this.c, tre.d(-1, -1.0f, jn7.D1, 12.0f, 12.0f, 12.0f, 0.0f));
        zb3 zb3Var2 = new zb3();
        zb3Var2.C = false;
        zb3Var2.n(150L);
        zb3Var2.m = false;
        this.d.setItemAnimator(zb3Var2);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        d79 d79Var3 = this.d;
        x46 x46Var2 = new x46(1, false);
        this.f = x46Var2;
        d79Var3.setLayoutManager(x46Var2);
        this.d.setAdapter(this.b);
        this.d.setClipToPadding(false);
        this.e = new hw6(this.d, this.f);
        this.x.addView(this.d, tre.c(-1.0f, -1));
        this.d.setEmptyView(this.c);
        d79 d79Var22 = this.d;
        d79Var22.X1 = true;
        d79Var22.Y1 = false;
        d79Var22.setOnItemClickListener(new wg((Object) this, i, (byte) 6));
        this.d.setOnItemLongClickListener(new gu2(this));
        this.d.setOnScrollListener(new ju2(this));
        if (!this.K) {
            zp4 zp4Var2 = new zp4(this.resourceProvider, context, false);
            this.s = zp4Var2;
            this.x.addView(zp4Var2, zp4.b());
            this.s.setOnClickListener(new r81(this, (byte) 21));
            this.s.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.s.c.getAnimatedDrawable().H(this.s.c.getAnimatedDrawable().e[0] - 1);
            this.s.setContentDescription(ob6.M0(2131751682, null));
        }
        str = this.W;
        if (str != null) {
        }
        f0();
        setBulletinDelegate(new t10(this, b));
        launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
        }
        View view2 = this.fragmentView;
        gu2 gu2Var2 = new gu2(this);
        WeakHashMap weakHashMap2 = ihc.a;
        ahc.i(view2, gu2Var2);
        return this.fragmentView;
    }

    public final void d0() {
        zp4 zp4Var = this.s;
        if (zp4Var != null) {
            zp4Var.setTranslationY(((-this.l0) - this.j0) - this.k0);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        d79 d79Var;
        if (i == jn7.N) {
            iu2 iu2Var = this.b;
            if (iu2Var != null) {
                if (!this.r) {
                    iu2Var.Y(2, true);
                }
                this.b.f();
            }
            if (this.h != null) {
                j79 adapter = this.d.getAdapter();
                hu2 hu2Var = this.h;
                if (adapter == hu2Var) {
                    hu2Var.G(this.c0);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2) {
            int i3 = jn7.a0;
            int i4 = jn7.s;
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
                jn7.f(this.currentAccount).k(i4, new Object[0]);
                presentFragment(new zu1(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i5 = uc7.r5;
        if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (d79Var = this.d) != null) {
            int childCount = d79Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.d.getChildAt(i6);
                if (childAt instanceof vac) {
                    ((vac) childAt).i(intValue);
                }
            }
        }
        int i7 = uc7.r5;
        if ((intValue & 4) == 0 || this.r || this.b == null || this.g0) {
            return;
        }
        this.g0 = true;
        p1 p1Var = this.h0;
        hl.r(p1Var);
        hl.d3(p1Var, 5000L);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return !this.H;
    }

    public final void e0() {
        iu2 iu2Var;
        zp4 zp4Var = this.s;
        if (zp4Var == null || (iu2Var = this.b) == null) {
            return;
        }
        zp4Var.e((!this.w || this.E || iu2Var.J) ? false : true, true);
    }

    public final void f0() {
        iu2 iu2Var = this.b;
        boolean z = iu2Var != null && iu2Var.J;
        if (this.n0 == z && this.o0) {
            return;
        }
        this.b0.setSearchFieldHint(ob6.M0(z ? 2131745462 : 2131745540, null));
        this.n0 = z;
        this.o0 = true;
    }

    public final void g0(TLRPC.User user, boolean z, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z || this.T == null) {
            lu2 lu2Var = this.V;
            if (lu2Var != null) {
                lu2Var.b(user);
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
                        d31.b0(this).t(ob6.M0(2131753101, null), null).j();
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                if (this.R != 0) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.R));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    boolean w = xc2.w(4, M0);
                    id idVar = alertDialog$Builder.a;
                    if (w) {
                        idVar.S = ob6.M0(2131754454, null);
                        idVar.U = ob6.M0(2131754453, null);
                        alertDialog$Builder.j(ob6.M0(2131754459, null), new q72(this, user, str));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    } else {
                        idVar.U = ob6.M0(2131752547, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    }
                    showDialog(idVar);
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            String M02 = ob6.M0(R.string.AppName, null);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = M02;
            byte b = 0;
            String b0 = ob6.b0(this.T, lbc.r(user));
            if (user.bot || !this.O) {
                editTextBoldCursor = null;
            } else {
                b0 = qd4.y(b0, "\n\n", ob6.M0(2131754358, null));
                editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setText("50");
                yob.X(editTextBoldCursor, aob.j5, getResourceProvider());
                editTextBoldCursor.setGravity(17);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setBackground(aob.T(getParentActivity()));
                editTextBoldCursor.addTextChangedListener(new ku2(editTextBoldCursor));
                alertDialog$Builder2.n(editTextBoldCursor);
            }
            idVar2.U = b0;
            alertDialog$Builder2.j(ob6.M0(2131747558, null), new fu2(this, user, editTextBoldCursor, b));
            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
            showDialog(idVar2);
            if (editTextBoldCursor != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                if (marginLayoutParams != null) {
                    if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                    }
                    int L = hl.L(24.0f);
                    marginLayoutParams.leftMargin = L;
                    marginLayoutParams.rightMargin = L;
                    marginLayoutParams.height = hl.L(36.0f);
                    editTextBoldCursor.setLayoutParams(marginLayoutParams);
                }
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 3);
        if (!this.H) {
            arrayList.add(new apb(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        }
        arrayList.add(new apb(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.d, 0, new Class[]{vac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        arrayList.add(new apb(this.d, 262148, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.o6));
        zp4 zp4Var = this.s;
        if (zp4Var != null) {
            arrayList.add(new apb(zp4Var.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.P9));
            arrayList.add(new apb(this.s.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        this.simpleActionBar.y();
        int childCount = this.d.getChildCount();
        int i = 0;
        while (true) {
            zh6 zh6Var = this.a0;
            if (i >= childCount) {
                zh6Var.b();
                return;
            }
            View childAt = this.d.getChildAt(i);
            if (childAt instanceof vac) {
                vac vacVar = (vac) childAt;
                if (zh6Var.h(vacVar.getDialogId()) >= 0) {
                    vacVar.c(false, true);
                }
            } else if (childAt instanceof bv8) {
                bv8 bv8Var = (bv8) childAt;
                if (zh6Var.h(bv8Var.getDialogId()) >= 0) {
                    bv8Var.A(false, true);
                }
            }
            i++;
        }
    }

    public final /* synthetic */ void i0(int i) {
        uc7.f1().edit().putBoolean("askAboutContacts2", false).commit();
        jn7.f(this.currentAccount).k(jn7.S5, new Object[0]);
        this.Y = i != 0;
        if (i == 0) {
            return;
        }
        b0(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ej6
    public final rz4 j() {
        return getBaseSimpleGlass().c();
    }

    public final void j0(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", lv2.r(this.currentAccount).s(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void k0(View view, int i, int i2) {
        j79 adapter = this.d.getAdapter();
        hu2 hu2Var = this.h;
        zh6 zh6Var = this.a0;
        if (adapter == hu2Var) {
            hu2Var.getClass();
            Object E = this.h.E(i2);
            if (!zh6Var.i() && (view instanceof bv8)) {
                bv8 bv8Var = (bv8) view;
                if (bv8Var.getUser() == null || !bv8Var.getUser().contact) {
                    return;
                }
                m0(bv8Var);
                return;
            }
            if (!(E instanceof TLRPC.User)) {
                if (!(E instanceof String)) {
                    if (E instanceof iv2) {
                        iv2 iv2Var = (iv2) E;
                        jj.u(this, iv2Var.i, iv2Var.j, (String) iv2Var.e.get(0));
                        return;
                    }
                    return;
                }
                String str = (String) E;
                if (str.equals("section")) {
                    return;
                }
                if (uc7.s1(this.currentAccount).x2()) {
                    i5.b(this.currentAccount);
                    return;
                }
                rl7 rl7Var = new rl7(this, getParentActivity());
                rl7Var.I0(str, true);
                rl7Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            hu2 hu2Var2 = this.h;
            int size = hu2Var2.d.size();
            int size2 = hu2Var2.I.size();
            sv9 sv9Var = hu2Var2.f;
            int size3 = sv9Var.e.size();
            int size4 = sv9Var.j.size();
            if ((i2 < 0 || i2 >= size) && ((i2 <= size || i2 >= size + size2 + 1) && ((i2 <= size + size2 + 1 || i2 >= size + size4 + size2 + 1) && i2 > size + size4 + size2 + 1 && i2 <= size3 + size4 + size + size2 + 1))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                getMessagesController().j4(arrayList, false);
                jf7.Y(this.currentAccount).j1(arrayList, null, false, true);
            }
            if (this.J) {
                g0(user, true, null);
                return;
            }
            if (this.K) {
                if (user.id != yac.h(this.currentAccount).e()) {
                    this.L = true;
                    wx9.i(this.currentAccount).A(getParentActivity(), user);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            if (getMessagesController().C(bundle, this, null, null)) {
                presentFragment(new zu1(bundle), this.P);
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
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof mv2)) {
            zp4 zp4Var = this.s;
            if (zp4Var != null) {
                zp4Var.performClick();
                return;
            }
            return;
        }
        if (!zh6Var.i() && (view instanceof vac)) {
            m0((vac) view);
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
                    wx9.i(this.currentAccount).A(getParentActivity(), user2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                if (getMessagesController().C(bundle2, this, null, null)) {
                    presentFragment(new zu1(bundle2), this.P);
                    return;
                }
                return;
            }
            if (O instanceof iv2) {
                ArrayList arrayList2 = ((iv2) O).e;
                String str2 = !arrayList2.isEmpty() ? (String) arrayList2.get(0) : null;
                if (str2 == null || getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131748860, null);
                id idVar = alertDialog$Builder.a;
                idVar.U = M0;
                idVar.S = ob6.M0(R.string.AppName, null);
                alertDialog$Builder.j(ob6.M0(2131747558, null), new q72((Object) this, (Object) str2, (byte) 11));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                showDialog(idVar);
                return;
            }
            return;
        }
        if (this.G) {
            if (Q != 0) {
                if (Q == 1) {
                    presentFragment(new i91(null));
                    return;
                }
                return;
            } else if (uc7.s1(this.currentAccount).x2()) {
                i5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new hs5());
                return;
            }
        }
        if (i != 0) {
            if (Q == 0) {
                if (uc7.s1(this.currentAccount).x2()) {
                    i5.b(this.currentAccount);
                    return;
                }
                long j = this.S;
                if (j == 0) {
                    j = this.R;
                }
                dd5 dd5Var = new dd5(null);
                dd5Var.d = j;
                presentFragment(dd5Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (uc7.s1(this.currentAccount).x2()) {
                i5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new rc5(new Bundle()), false);
                return;
            }
        }
        if (Q == 1) {
            if (uc7.s1(this.currentAccount).x2()) {
                i5.b(this.currentAccount);
                return;
            }
            SharedPreferences e1 = uc7.e1();
            boolean z = f11.a;
            presentFragment(new v8(0));
            e1.edit().putBoolean("channel_intro", true).commit();
        }
    }

    public final void l0() {
        if (uc7.s1(this.currentAccount).x2()) {
            i5.b(this.currentAccount);
        } else {
            new rl7(this, getParentActivity()).show();
        }
    }

    public final void m0(ViewGroup viewGroup) {
        boolean z;
        boolean z2 = viewGroup instanceof vac;
        boolean z3 = true;
        zh6 zh6Var = this.a0;
        if (z2) {
            vac vacVar = (vac) viewGroup;
            long dialogId = vacVar.getDialogId();
            if (zh6Var.h(dialogId) >= 0) {
                zh6Var.l(dialogId);
                vacVar.c(false, true);
            } else if (vacVar.getCurrentObject() instanceof TLRPC.User) {
                zh6Var.k(dialogId, (TLRPC.User) vacVar.getCurrentObject());
                vacVar.c(true, true);
                z = true;
            }
            z = false;
        } else {
            if (!(viewGroup instanceof bv8)) {
                return;
            }
            bv8 bv8Var = (bv8) viewGroup;
            long dialogId2 = bv8Var.getDialogId();
            if (zh6Var.h(dialogId2) >= 0) {
                zh6Var.l(dialogId2);
                bv8Var.A(false, true);
            } else if (bv8Var.getUser() != null) {
                zh6Var.k(dialogId2, bv8Var.getUser());
                bv8Var.A(true, true);
                z = true;
            }
            z = false;
        }
        if (!this.simpleActionBar.z()) {
            if (z) {
                hl.t1(this.fragmentView.findFocus());
                this.simpleActionBar.H(zh6Var.m(), false);
                this.simpleActionBar.L();
            }
            z3 = false;
        } else if (zh6Var.i()) {
            h0();
            return;
        }
        this.simpleActionBar.H(zh6Var.m(), z3);
    }

    @Override // i1d
    public final void o(l2d l2dVar) {
        this.m0 = l2dVar.a.f(8).d;
        c0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (!this.simpleActionBar.z()) {
            jla jlaVar = this.simpleActionBar;
            if (!jlaVar.L) {
                return super.onBackPressed(z);
            }
            if (z) {
                jlaVar.o(true);
            }
        } else if (z) {
            h0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
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
            id idVar = jj.v(parentActivity, new du2(this, (byte) 0)).a;
            this.X = idVar;
            showDialog(idVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        id idVar = this.X;
        if (idVar == null || dialog != idVar || getParentActivity() == null || !this.Y) {
            return;
        }
        b0(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        jn7.f(this.currentAccount).b(this, jn7.N);
        jn7.f(this.currentAccount).b(this, 2);
        jn7.f(this.currentAccount).b(this, jn7.a0);
        jn7.f(this.currentAccount).b(this, jn7.s);
        this.d0 = yac.h(this.currentAccount).V;
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
            this.r = xea.H0;
        }
        getContactsController().f();
        getContactsController().J(false);
        this.i0 = this.H ? hl.L(72.0f) : 0;
        this.j0 = this.H ? hl.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.N);
        jn7.f(this.currentAccount).n(this, 2);
        jn7.f(this.currentAccount).n(this, jn7.a0);
        jn7.f(this.currentAccount).n(this, jn7.s);
        this.V = null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.l0 = i4;
        eg0.g(this.d, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), this.i0);
        d0();
        c0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.o(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr.length > i2 && "android.permission.READ_CONTACTS".equals(strArr[i2])) {
                    if (iArr[i2] == 0) {
                        lv2.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = uc7.f1().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.e0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.a.b.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        iu2 iu2Var = this.b;
        if (iu2Var != null) {
            iu2Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                d79 d79Var = this.d;
                if (d79Var != null) {
                    d79Var.y1();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            iu2 iu2Var = this.b;
            ArrayList arrayList = iu2Var.O;
            iu2Var.M = f;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((t26) arrayList.get(i2)).setLetterProgress(f);
            }
            this.d.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // ej6
    public final void v() {
        if (this.f.K0() < 15) {
            this.d.A0(0);
            return;
        }
        hw6 hw6Var = this.e;
        hw6Var.b = 1;
        hw6Var.k(0, 0, false, false);
    }

    @Override // ej6
    public final void F() {
    }

    @Override // i1d
    public final void P() {
    }

    @Override // i1d
    public final void w() {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
