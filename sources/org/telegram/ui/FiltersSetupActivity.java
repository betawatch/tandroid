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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public et a;
    public j00 b;
    public v4.z c;
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

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i7) {
        h00 h00Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i7 < 0 || i7 >= arrayList.size() || (h00Var = (h00) arrayList.get(i7)) == null) {
            return;
        }
        int i10 = h00Var.a;
        if (i10 != 6) {
            if (i10 != 2) {
                if (i10 == 4) {
                    filtersSetupActivity.d0(filtersSetupActivity.getParentLayout());
                    return;
                }
                return;
            }
            org.telegram.messenger.ro roVar = h00Var.d;
            if (roVar == null || roVar.d()) {
                return;
            }
            if (roVar.p) {
                filtersSetupActivity.showDialog(new ug.l0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                return;
            } else {
                filtersSetupActivity.presentFragment(new kz(roVar, null));
                return;
            }
        }
        if (!filtersSetupActivity.getUserConfig().q()) {
            filtersSetupActivity.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) filtersSetupActivity, 35, true));
            return;
        }
        TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
        tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().D7;
        org.telegram.messenger.mp messagesController = filtersSetupActivity.getMessagesController();
        boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
        SharedPreferences.Editor edit = messagesController.h7.edit();
        messagesController.D7 = z10;
        edit.putBoolean("folderTags", z10).apply();
        filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new e00(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
        ((org.telegram.ui.Cells.r8) view).setChecked(filtersSetupActivity.getMessagesController().D7);
        j00 j00Var = filtersSetupActivity.b;
        int i11 = filtersSetupActivity.s;
        j00Var.k(i11, filtersSetupActivity.w - i11);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131750680, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 5));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        et etVar = new et(3, context, this);
        this.a = etVar;
        etVar.r1();
        this.a.setClipChildren(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.C = false;
        kVar.m = false;
        this.a.setItemAnimator(kVar);
        this.a.setSectionsDrawBackground(true);
        ((v4.k) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new v4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        v4.z zVar = new v4.z(new org.telegram.ui.Components.oz(this));
        this.c = zVar;
        zVar.h(this.a);
        frameLayout.addView(this.a, c8.ma.c(-1.0f, -1));
        et etVar2 = this.a;
        j00 j00Var = new j00(this, context);
        this.b = j00Var;
        etVar2.setAdapter(j00Var);
        this.a.setOnItemClickListener(new at(6, this, context));
        if (this.f) {
            g0(false);
            this.f = false;
            this.a.v0(this.b.b() - 1);
            org.telegram.messenger.g0.h3(new d00(this, i7), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.s4 s4Var) {
        int size = getMessagesController().V0().size();
        if ((size - 1 >= getMessagesController().O4 && !getUserConfig().q()) || size >= getMessagesController().P4) {
            showDialog(new ug.l0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (s4Var != null) {
            ((ActionBarLayout) s4Var).S(new kz(null, null));
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O2) {
            g0(true);
        } else if (i7 == org.telegram.messenger.ks.S2) {
            g0(true);
        }
    }

    public final UndoView e0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(d00 d00Var) {
        if (!this.e) {
            if (d00Var != null) {
                d00Var.run();
                return;
            }
            return;
        }
        int i7 = 0;
        this.e = false;
        getNotificationCenter().k(org.telegram.messenger.ks.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList V0 = getMessagesController().V0();
        int size = V0.size();
        while (i7 < size) {
            org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.get(i7);
            i7 = com.google.android.gms.internal.vision.e2.f(roVar.a, i7, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(d00Var, 8));
    }

    public final void g0(boolean z10) {
        this.showTagsRow = -1;
        et etVar = this.a;
        if (etVar != null) {
            ArrayList arrayList = etVar.L2;
            if (arrayList == null) {
                etVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().W0;
        ArrayList V0 = getMessagesController().V0();
        int i7 = 0;
        arrayList3.add(new h00(1, false));
        if (!arrayList4.isEmpty() && V0.size() < 10) {
            int size = arrayList3.size();
            String M0 = org.telegram.messenger.gd.M0(2131750705, null);
            h00 h00Var = new h00(0, false);
            h00Var.c = M0;
            arrayList3.add(h00Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                h00 h00Var2 = new h00(5, false);
                h00Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(h00Var2);
            }
            et etVar2 = this.a;
            if (etVar2 != null) {
                etVar2.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            h00 h00Var3 = new h00(3, false);
            h00Var3.c = null;
            arrayList3.add(h00Var3);
        }
        if (V0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String M02 = org.telegram.messenger.gd.M0(2131750680, null);
            h00 h00Var4 = new h00(0, false);
            h00Var4.c = M02;
            arrayList3.add(h00Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < V0.size(); i11++) {
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.get(i11);
                h00 h00Var5 = new h00(2, false);
                h00Var5.d = roVar;
                arrayList3.add(h00Var5);
                if (org.telegram.messenger.mp.u1(this.currentAccount).D7 && ((org.telegram.messenger.ro) V0.get(i11)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            et etVar3 = this.a;
            if (etVar3 != null) {
                etVar3.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(this.s, (size2 - 1) + (V0.size() >= getMessagesController().P4 ? 0 : 1))));
            }
        }
        if (V0.size() < getMessagesController().P4) {
            String M03 = org.telegram.messenger.gd.M0(2131751705, null);
            h00 h00Var6 = new h00(4, false);
            h00Var6.c = M03;
            arrayList3.add(h00Var6);
        }
        h00 h00Var7 = new h00(3, false);
        h00Var7.c = null;
        arrayList3.add(h00Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M04 = org.telegram.messenger.gd.M0(2131750609, null);
        h00 h00Var8 = new h00(6, false);
        h00Var8.c = M04;
        arrayList3.add(h00Var8);
        CharSequence R2 = !getUserConfig().q() ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750607, null), org.telegram.ui.ActionBar.n6.L6, 2, new d00(this, i7), null) : org.telegram.messenger.gd.M0(2131750608, null);
        h00 h00Var9 = new h00(3, false);
        h00Var9.c = R2;
        arrayList3.add(h00Var9);
        j00 j00Var = this.b;
        if (j00Var != null) {
            if (z10) {
                j00Var.E(arrayList2, arrayList3);
            } else {
                j00Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, l00.class, k00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 196608, new Class[]{f00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        g0(false);
        getMessagesController().i3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.ks.O2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.S2);
        if (getMessagesController().W0.isEmpty()) {
            getMessagesController().j3();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ks.O2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        j00 j00Var = this.b;
        if (j00Var != null) {
            j00Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
