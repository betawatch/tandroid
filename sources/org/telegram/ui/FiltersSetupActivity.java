package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public fv a;
    public lh4 b;
    public hu5 c;
    public UndoView d;
    public boolean e;
    public boolean f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    private int showTagsRow;
    public int w;
    public int x;
    public boolean y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.w = -1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.j7));
        hashSet.add(Integer.valueOf(cmb.M6));
        hashSet.add(Integer.valueOf(cmb.n6));
        hashSet.add(Integer.valueOf(cmb.Ki));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void c0(tk5 tk5Var) {
        int size = getMessagesController().S0().size();
        if ((size - 1 >= getMessagesController().l4.Z0.f() && !getUserConfig().p()) || size >= getMessagesController().l4.a1.f()) {
            showDialog(new i46(3, this.currentAccount, null, getParentActivity(), this));
        } else if (tk5Var != null) {
            ((ActionBarLayout) tk5Var).S(new qf4(null, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131750628, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 18));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        fv fvVar = new fv((byte) 21, context, (Object) this);
        this.a = fvVar;
        fvVar.r1();
        this.a.setClipChildren(false);
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.a.setItemAnimator(sc3Var);
        this.a.setSectionsDrawBackground(true);
        ((sc3) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new u46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        hu5 hu5Var = new hu5(new hg4(this));
        this.c = hu5Var;
        hu5Var.h(this.a);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        fv fvVar2 = this.a;
        lh4 lh4Var = new lh4(this, context);
        this.b = lh4Var;
        fvVar2.setAdapter(lh4Var);
        this.a.setOnItemClickListener(new x92((Object) this, (Object) context, (byte) 28));
        if (this.f) {
            g0(false);
            this.f = false;
            this.a.w0(this.b.b() - 1);
            gm.d3(new eh4(this, b), 200L);
        }
        return this.fragmentView;
    }

    public final UndoView d0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.O2) {
            g0(true);
        } else if (i == nm7.S2) {
            g0(true);
        }
    }

    public final void e0(Context context, View view, int i) {
        jh4 jh4Var;
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size() || (jh4Var = (jh4) arrayList.get(i)) == null) {
                return;
            }
            int i2 = jh4Var.a;
            byte b = 4;
            if (i2 != 6) {
                if (i2 != 2) {
                    if (i2 == 4) {
                        c0(getParentLayout());
                        return;
                    }
                    return;
                }
                ub7 ub7Var = jh4Var.d;
                if (ub7Var == null || ub7Var.d()) {
                    return;
                }
                if (ub7Var.p) {
                    showDialog(new i46(3, this.currentAccount, null, context, this));
                    return;
                } else {
                    presentFragment(new qf4(ub7Var, null));
                    return;
                }
            }
            if (!getUserConfig().p()) {
                showDialog(new kj8((org.telegram.ui.ActionBar.d) this, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = !getMessagesController().m4;
            oc7 messagesController = getMessagesController();
            boolean z = tL_messages_toggleDialogFilterTags.enabled;
            SharedPreferences.Editor edit = messagesController.X3.edit();
            messagesController.m4 = z;
            edit.putBoolean("folderTags", z).apply();
            getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new cx3(this, tL_messages_toggleDialogFilterTags, b));
            ((bjb) view).setChecked(getMessagesController().m4);
            lh4 lh4Var = this.b;
            int i3 = this.s;
            lh4Var.l(i3, this.w - i3);
        }
    }

    public final void f0(eh4 eh4Var) {
        if (!this.e) {
            if (eh4Var != null) {
                eh4Var.run();
                return;
            }
            return;
        }
        int i = 0;
        this.e = false;
        getNotificationCenter().k(nm7.O2, new Object[0]);
        getMessagesStorage().v1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList S0 = getMessagesController().S0();
        int size = S0.size();
        while (i < size) {
            ub7 ub7Var = (ub7) S0.get(i);
            i = td4.g(ub7Var.a, i, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new tg(eh4Var, (byte) 28));
    }

    public final void g0(boolean z) {
        this.showTagsRow = -1;
        fv fvVar = this.a;
        if (fvVar != null) {
            ArrayList arrayList = fvVar.L2;
            if (arrayList == null) {
                fvVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().M0;
        ArrayList S0 = getMessagesController().S0();
        byte b = 0;
        arrayList3.add(new jh4(1, false));
        if (!arrayList4.isEmpty() && S0.size() < 10) {
            int size = arrayList3.size();
            String M0 = jb6.M0(2131750653, null);
            jh4 jh4Var = new jh4(0, false);
            jh4Var.c = M0;
            arrayList3.add(jh4Var);
            for (int i = 0; i < arrayList4.size(); i++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i);
                jh4 jh4Var2 = new jh4(5, false);
                jh4Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(jh4Var2);
            }
            fv fvVar2 = this.a;
            if (fvVar2 != null) {
                fvVar2.L2.add(Long.valueOf(gm.u2(size, arrayList3.size() - 1)));
            }
            jh4 jh4Var3 = new jh4(3, false);
            jh4Var3.c = null;
            arrayList3.add(jh4Var3);
        }
        if (S0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String M02 = jb6.M0(2131750628, null);
            jh4 jh4Var4 = new jh4(0, false);
            jh4Var4.c = M02;
            arrayList3.add(jh4Var4);
            this.r = arrayList3.size();
            for (int i2 = 0; i2 < S0.size(); i2++) {
                ub7 ub7Var = (ub7) S0.get(i2);
                jh4 jh4Var5 = new jh4(2, false);
                jh4Var5.d = ub7Var;
                arrayList3.add(jh4Var5);
                if (oc7.r1(this.currentAccount).m4 && ((ub7) S0.get(i2)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            fv fvVar3 = this.a;
            if (fvVar3 != null) {
                fvVar3.L2.add(Long.valueOf(gm.u2(this.s, (size2 - 1) + (S0.size() >= getMessagesController().l4.a1.f() ? 0 : 1))));
            }
        }
        if (S0.size() < getMessagesController().l4.a1.f()) {
            String M03 = jb6.M0(2131751653, null);
            jh4 jh4Var6 = new jh4(4, false);
            jh4Var6.c = M03;
            arrayList3.add(jh4Var6);
        }
        jh4 jh4Var7 = new jh4(3, false);
        jh4Var7.c = null;
        arrayList3.add(jh4Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M04 = jb6.M0(2131750557, null);
        jh4 jh4Var8 = new jh4(6, false);
        jh4Var8.c = M04;
        arrayList3.add(jh4Var8);
        CharSequence N2 = !getUserConfig().p() ? gm.N2(jb6.M0(2131750555, null), cmb.K6, 2, new eh4(this, b), null) : jb6.M0(2131750556, null);
        jh4 jh4Var9 = new jh4(3, false);
        jh4Var9.c = N2;
        arrayList3.add(jh4Var9);
        lh4 lh4Var = this.b;
        if (lh4Var != null) {
            if (z) {
                lh4Var.E(arrayList2, arrayList3);
            } else {
                lh4Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.a, 16, new Class[]{jf5.class, nh4.class, mh4.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.a, 196608, new Class[]{hh4.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (bnb) null, cmb.Li));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        g0(false);
        getMessagesController().g3(true, null);
        getNotificationCenter().b(this, nm7.O2);
        getNotificationCenter().b(this, nm7.S2);
        if (getMessagesController().M0.isEmpty()) {
            getMessagesController().h3();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.O2);
        getNotificationCenter().n(this, nm7.S2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        lh4 lh4Var = this.b;
        if (lh4Var != null) {
            lh4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
