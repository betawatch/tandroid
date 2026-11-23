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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public dt a;
    public i00 b;
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
        g00 g00Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i7 < 0 || i7 >= arrayList.size() || (g00Var = (g00) arrayList.get(i7)) == null) {
            return;
        }
        int i10 = g00Var.a;
        if (i10 != 6) {
            if (i10 != 2) {
                if (i10 == 4) {
                    filtersSetupActivity.d0(filtersSetupActivity.getParentLayout());
                    return;
                }
                return;
            }
            org.telegram.messenger.ro roVar = g00Var.d;
            if (roVar == null || roVar.d()) {
                return;
            }
            if (roVar.p) {
                filtersSetupActivity.showDialog(new ug.k0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                return;
            } else {
                filtersSetupActivity.presentFragment(new jz(roVar, null));
                return;
            }
        }
        if (!filtersSetupActivity.getUserConfig().q()) {
            filtersSetupActivity.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) filtersSetupActivity, 35, true));
            return;
        }
        TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
        tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().D7;
        org.telegram.messenger.mp messagesController = filtersSetupActivity.getMessagesController();
        boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
        SharedPreferences.Editor edit = messagesController.h7.edit();
        messagesController.D7 = z10;
        edit.putBoolean("folderTags", z10).apply();
        filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new d00(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
        ((org.telegram.ui.Cells.r8) view).setChecked(filtersSetupActivity.getMessagesController().D7);
        i00 i00Var = filtersSetupActivity.b;
        int i11 = filtersSetupActivity.s;
        i00Var.k(i11, filtersSetupActivity.w - i11);
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131750679, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 5));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        dt dtVar = new dt(3, context, this);
        this.a = dtVar;
        dtVar.r1();
        this.a.setClipChildren(false);
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.m = false;
        this.a.setItemAnimator(lVar);
        this.a.setSectionsDrawBackground(true);
        ((v4.l) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new v4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        v4.z zVar = new v4.z(new org.telegram.ui.Components.nz(this));
        this.c = zVar;
        zVar.h(this.a);
        frameLayout.addView(this.a, c8.na.c(-1.0f, -1));
        dt dtVar2 = this.a;
        i00 i00Var = new i00(this, context);
        this.b = i00Var;
        dtVar2.setAdapter(i00Var);
        this.a.setOnItemClickListener(new zs(6, this, context));
        if (this.f) {
            g0(false);
            this.f = false;
            this.a.v0(this.b.b() - 1);
            org.telegram.messenger.g0.h3(new c00(this, i7), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.r4 r4Var) {
        int size = getMessagesController().V0().size();
        if ((size - 1 >= getMessagesController().O4 && !getUserConfig().q()) || size >= getMessagesController().P4) {
            showDialog(new ug.k0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (r4Var != null) {
            ((ActionBarLayout) r4Var).S(new jz(null, null));
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
            frameLayout.addView(undoView, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(c00 c00Var) {
        if (!this.e) {
            if (c00Var != null) {
                c00Var.run();
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
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(c00Var, 8));
    }

    public final void g0(boolean z10) {
        this.showTagsRow = -1;
        dt dtVar = this.a;
        if (dtVar != null) {
            ArrayList arrayList = dtVar.L2;
            if (arrayList == null) {
                dtVar.L2 = new ArrayList();
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
        arrayList3.add(new g00(1, false));
        if (!arrayList4.isEmpty() && V0.size() < 10) {
            int size = arrayList3.size();
            String N0 = org.telegram.messenger.gd.N0(2131750704, null);
            g00 g00Var = new g00(0, false);
            g00Var.c = N0;
            arrayList3.add(g00Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                g00 g00Var2 = new g00(5, false);
                g00Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(g00Var2);
            }
            dt dtVar2 = this.a;
            if (dtVar2 != null) {
                dtVar2.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            g00 g00Var3 = new g00(3, false);
            g00Var3.c = null;
            arrayList3.add(g00Var3);
        }
        if (V0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String N02 = org.telegram.messenger.gd.N0(2131750679, null);
            g00 g00Var4 = new g00(0, false);
            g00Var4.c = N02;
            arrayList3.add(g00Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < V0.size(); i11++) {
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.get(i11);
                g00 g00Var5 = new g00(2, false);
                g00Var5.d = roVar;
                arrayList3.add(g00Var5);
                if (org.telegram.messenger.mp.u1(this.currentAccount).D7 && ((org.telegram.messenger.ro) V0.get(i11)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            dt dtVar3 = this.a;
            if (dtVar3 != null) {
                dtVar3.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(this.s, (size2 - 1) + (V0.size() >= getMessagesController().P4 ? 0 : 1))));
            }
        }
        if (V0.size() < getMessagesController().P4) {
            String N03 = org.telegram.messenger.gd.N0(2131751704, null);
            g00 g00Var6 = new g00(4, false);
            g00Var6.c = N03;
            arrayList3.add(g00Var6);
        }
        g00 g00Var7 = new g00(3, false);
        g00Var7.c = null;
        arrayList3.add(g00Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String N04 = org.telegram.messenger.gd.N0(2131750608, null);
        g00 g00Var8 = new g00(6, false);
        g00Var8.c = N04;
        arrayList3.add(g00Var8);
        CharSequence R2 = !getUserConfig().q() ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750606, null), org.telegram.ui.ActionBar.n6.L6, 2, new c00(this, i7), null) : org.telegram.messenger.gd.N0(2131750607, null);
        g00 g00Var9 = new g00(3, false);
        g00Var9.c = R2;
        arrayList3.add(g00Var9);
        i00 i00Var = this.b;
        if (i00Var != null) {
            if (z10) {
                i00Var.E(arrayList2, arrayList3);
            } else {
                i00Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 16, new Class[]{org.telegram.ui.Cells.o4.class, k00.class, j00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 196608, new Class[]{e00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ks.O2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        i00 i00Var = this.b;
        if (i00Var != null) {
            i00Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
