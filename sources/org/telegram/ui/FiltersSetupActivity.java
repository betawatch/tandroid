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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public zs a;
    public e00 b;
    public v4.y c;
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
        c00 c00Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i7 < 0 || i7 >= arrayList.size() || (c00Var = (c00) arrayList.get(i7)) == null) {
            return;
        }
        int i10 = c00Var.a;
        if (i10 != 6) {
            if (i10 != 2) {
                if (i10 == 4) {
                    filtersSetupActivity.d0(filtersSetupActivity.getParentLayout());
                    return;
                }
                return;
            }
            org.telegram.messenger.vo voVar = c00Var.d;
            if (voVar == null || voVar.e()) {
                return;
            }
            if (voVar.p) {
                filtersSetupActivity.showDialog(new ug.i0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                return;
            } else {
                filtersSetupActivity.presentFragment(new gz(voVar, null));
                return;
            }
        }
        if (!filtersSetupActivity.getUserConfig().q()) {
            filtersSetupActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity, 35, true));
            return;
        }
        TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
        tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().A7;
        org.telegram.messenger.qp messagesController = filtersSetupActivity.getMessagesController();
        boolean z9 = tL_messages_toggleDialogFilterTags.enabled;
        SharedPreferences.Editor edit = messagesController.e7.edit();
        messagesController.A7 = z9;
        edit.putBoolean("folderTags", z9).apply();
        filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new ld(28, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
        ((org.telegram.ui.Cells.r8) view).setChecked(filtersSetupActivity.getMessagesController().A7);
        e00 e00Var = filtersSetupActivity.b;
        int i11 = filtersSetupActivity.s;
        e00Var.k(i11, filtersSetupActivity.w - i11);
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131750697, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 2));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = 3;
        zs zsVar = new zs(i10, context, this);
        this.a = zsVar;
        zsVar.r1();
        this.a.setClipChildren(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.a.setItemAnimator(kVar);
        this.a.setSectionsDrawBackground(true);
        ((v4.k) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new v4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        v4.y yVar = new v4.y(new org.telegram.ui.Components.dz(this));
        this.c = yVar;
        yVar.h(this.a);
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        zs zsVar2 = this.a;
        e00 e00Var = new e00(this, context);
        this.b = e00Var;
        zsVar2.setAdapter(e00Var);
        this.a.setOnItemClickListener(new pu(i10, this, context));
        if (this.f) {
            g0(false);
            this.f = false;
            this.a.v0(this.b.b() - 1);
            org.telegram.messenger.g0.i3(new zz(this, i7), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.q4 q4Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().L4 && !getUserConfig().q()) || size >= getMessagesController().M4) {
            showDialog(new ug.i0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (q4Var != null) {
            ((ActionBarLayout) q4Var).S(new gz(null, null));
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O2) {
            g0(true);
        } else if (i7 == org.telegram.messenger.qs.Q2) {
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
            frameLayout.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(zz zzVar) {
        if (!this.e) {
            if (zzVar != null) {
                zzVar.run();
                return;
            }
            return;
        }
        int i7 = 0;
        this.e = false;
        getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = getMessagesController().T0();
        int size = T0.size();
        while (i7 < size) {
            org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i7);
            i7 = com.google.android.recaptcha.internal.a.f(voVar.a, i7, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(zzVar, 8));
    }

    public final void g0(boolean z9) {
        this.showTagsRow = -1;
        zs zsVar = this.a;
        if (zsVar != null) {
            ArrayList arrayList = zsVar.K2;
            if (arrayList == null) {
                zsVar.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().V0;
        ArrayList T0 = getMessagesController().T0();
        int i7 = 0;
        arrayList3.add(new c00(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M0 = org.telegram.messenger.hd.M0(2131750719, null);
            c00 c00Var = new c00(0, false);
            c00Var.c = M0;
            arrayList3.add(c00Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                c00 c00Var2 = new c00(5, false);
                c00Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(c00Var2);
            }
            zs zsVar2 = this.a;
            if (zsVar2 != null) {
                zsVar2.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            c00 c00Var3 = new c00(3, false);
            c00Var3.c = null;
            arrayList3.add(c00Var3);
        }
        if (T0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String M02 = org.telegram.messenger.hd.M0(2131750697, null);
            c00 c00Var4 = new c00(0, false);
            c00Var4.c = M02;
            arrayList3.add(c00Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < T0.size(); i11++) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i11);
                c00 c00Var5 = new c00(2, false);
                c00Var5.d = voVar;
                arrayList3.add(c00Var5);
                if (org.telegram.messenger.qp.s1(this.currentAccount).A7 && ((org.telegram.messenger.vo) T0.get(i11)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            zs zsVar3 = this.a;
            if (zsVar3 != null) {
                zsVar3.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(this.s, (size2 - 1) + (T0.size() >= getMessagesController().M4 ? 0 : 1))));
            }
        }
        if (T0.size() < getMessagesController().M4) {
            String M03 = org.telegram.messenger.hd.M0(2131751717, null);
            c00 c00Var6 = new c00(4, false);
            c00Var6.c = M03;
            arrayList3.add(c00Var6);
        }
        c00 c00Var7 = new c00(3, false);
        c00Var7.c = null;
        arrayList3.add(c00Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M04 = org.telegram.messenger.hd.M0(2131750626, null);
        c00 c00Var8 = new c00(6, false);
        c00Var8.c = M04;
        arrayList3.add(c00Var8);
        CharSequence S2 = !getUserConfig().q() ? org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750624, null), org.telegram.ui.ActionBar.k6.L6, 2, new zz(this, i7), null) : org.telegram.messenger.hd.M0(2131750625, null);
        c00 c00Var9 = new c00(3, false);
        c00Var9.c = S2;
        arrayList3.add(c00Var9);
        e00 e00Var = this.b;
        if (e00Var != null) {
            if (z9) {
                e00Var.E(arrayList2, arrayList3);
            } else {
                e00Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, g00.class, f00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{a00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ji));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        g0(false);
        getMessagesController().c3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.qs.O2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.Q2);
        if (getMessagesController().V0.isEmpty()) {
            getMessagesController().d3();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.O2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.Q2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        e00 e00Var = this.b;
        if (e00Var != null) {
            e00Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
