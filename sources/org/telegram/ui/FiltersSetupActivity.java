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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public xs a;
    public c00 b;
    public u4.y c;
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

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i3) {
        a00 a00Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i3 < 0 || i3 >= arrayList.size() || (a00Var = (a00) arrayList.get(i3)) == null) {
            return;
        }
        int i10 = a00Var.a;
        if (i10 != 6) {
            if (i10 != 2) {
                if (i10 == 4) {
                    filtersSetupActivity.d0(filtersSetupActivity.getParentLayout());
                    return;
                }
                return;
            }
            org.telegram.messenger.mo moVar = a00Var.d;
            if (moVar == null || moVar.e()) {
                return;
            }
            if (moVar.p) {
                filtersSetupActivity.showDialog(new vg.i0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                return;
            } else {
                filtersSetupActivity.presentFragment(new ez(moVar, null));
                return;
            }
        }
        if (!filtersSetupActivity.getUserConfig().q()) {
            filtersSetupActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) filtersSetupActivity, 35, true));
            return;
        }
        TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
        tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().A7;
        org.telegram.messenger.hp messagesController = filtersSetupActivity.getMessagesController();
        boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
        SharedPreferences.Editor edit = messagesController.e7.edit();
        messagesController.A7 = z10;
        edit.putBoolean("folderTags", z10).apply();
        filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new xy(1, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
        ((org.telegram.ui.Cells.q8) view).setChecked(filtersSetupActivity.getMessagesController().A7);
        c00 c00Var = filtersSetupActivity.b;
        int i11 = filtersSetupActivity.s;
        c00Var.k(i11, filtersSetupActivity.w - i11);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131750697, null));
        int i10 = 3;
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, i10));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        xs xsVar = new xs(i10, context, this);
        this.a = xsVar;
        xsVar.r1();
        this.a.setClipChildren(false);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.a.setItemAnimator(kVar);
        this.a.setSectionsDrawBackground(true);
        ((u4.k) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new u4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        u4.y yVar = new u4.y(new org.telegram.ui.Components.az(this));
        this.c = yVar;
        yVar.h(this.a);
        frameLayout.addView(this.a, b8.mf.c(-1.0f, -1));
        xs xsVar2 = this.a;
        c00 c00Var = new c00(this, context);
        this.b = c00Var;
        xsVar2.setAdapter(c00Var);
        this.a.setOnItemClickListener(new org.telegram.ui.Components.i41(13, this, context));
        if (this.f) {
            g0(false);
            this.f = false;
            this.a.v0(this.b.b() - 1);
            org.telegram.messenger.g0.i3(new xz(this, i3), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.q4 q4Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().L4 && !getUserConfig().q()) || size >= getMessagesController().M4) {
            showDialog(new vg.i0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (q4Var != null) {
            ((ActionBarLayout) q4Var).S(new ez(null, null));
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.O2) {
            g0(true);
        } else if (i3 == org.telegram.messenger.hs.Q2) {
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
            frameLayout.addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(xz xzVar) {
        if (!this.e) {
            if (xzVar != null) {
                xzVar.run();
                return;
            }
            return;
        }
        int i3 = 0;
        this.e = false;
        getNotificationCenter().k(org.telegram.messenger.hs.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = getMessagesController().T0();
        int size = T0.size();
        while (i3 < size) {
            org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.get(i3);
            i3 = com.google.android.recaptcha.internal.a.f(moVar.a, i3, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(xzVar, 8));
    }

    public final void g0(boolean z10) {
        this.showTagsRow = -1;
        xs xsVar = this.a;
        if (xsVar != null) {
            ArrayList arrayList = xsVar.L2;
            if (arrayList == null) {
                xsVar.L2 = new ArrayList();
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
        ArrayList T0 = getMessagesController().T0();
        int i3 = 0;
        arrayList3.add(new a00(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M0 = org.telegram.messenger.bd.M0(2131750719, null);
            a00 a00Var = new a00(0, false);
            a00Var.c = M0;
            arrayList3.add(a00Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                a00 a00Var2 = new a00(5, false);
                a00Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(a00Var2);
            }
            xs xsVar2 = this.a;
            if (xsVar2 != null) {
                xsVar2.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            a00 a00Var3 = new a00(3, false);
            a00Var3.c = null;
            arrayList3.add(a00Var3);
        }
        if (T0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String M02 = org.telegram.messenger.bd.M0(2131750697, null);
            a00 a00Var4 = new a00(0, false);
            a00Var4.c = M02;
            arrayList3.add(a00Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < T0.size(); i11++) {
                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.get(i11);
                a00 a00Var5 = new a00(2, false);
                a00Var5.d = moVar;
                arrayList3.add(a00Var5);
                if (org.telegram.messenger.hp.s1(this.currentAccount).A7 && ((org.telegram.messenger.mo) T0.get(i11)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            xs xsVar3 = this.a;
            if (xsVar3 != null) {
                xsVar3.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(this.s, (size2 - 1) + (T0.size() >= getMessagesController().M4 ? 0 : 1))));
            }
        }
        if (T0.size() < getMessagesController().M4) {
            String M03 = org.telegram.messenger.bd.M0(2131751717, null);
            a00 a00Var6 = new a00(4, false);
            a00Var6.c = M03;
            arrayList3.add(a00Var6);
        }
        a00 a00Var7 = new a00(3, false);
        a00Var7.c = null;
        arrayList3.add(a00Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M04 = org.telegram.messenger.bd.M0(2131750626, null);
        a00 a00Var8 = new a00(6, false);
        a00Var8.c = M04;
        arrayList3.add(a00Var8);
        CharSequence S2 = !getUserConfig().q() ? org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750624, null), org.telegram.ui.ActionBar.k6.L6, 2, new xz(this, i3), null) : org.telegram.messenger.bd.M0(2131750625, null);
        a00 a00Var9 = new a00(3, false);
        a00Var9.c = S2;
        arrayList3.add(a00Var9);
        c00 c00Var = this.b;
        if (c00Var != null) {
            if (z10) {
                c00Var.E(arrayList2, arrayList3);
            } else {
                c00Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, e00.class, d00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{yz.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ji));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        g0(false);
        getMessagesController().c3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.hs.O2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.Q2);
        if (getMessagesController().W0.isEmpty()) {
            getMessagesController().d3();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.O2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.Q2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        c00 c00Var = this.b;
        if (c00Var != null) {
            c00Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
