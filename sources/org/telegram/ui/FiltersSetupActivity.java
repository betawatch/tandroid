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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public bt a;
    public g00 b;
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
        e00 e00Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i7 < 0 || i7 >= arrayList.size() || (e00Var = (e00) arrayList.get(i7)) == null) {
            return;
        }
        int i10 = e00Var.a;
        if (i10 != 6) {
            if (i10 != 2) {
                if (i10 == 4) {
                    filtersSetupActivity.d0(filtersSetupActivity.getParentLayout());
                    return;
                }
                return;
            }
            org.telegram.messenger.vo voVar = e00Var.d;
            if (voVar == null || voVar.e()) {
                return;
            }
            if (voVar.p) {
                filtersSetupActivity.showDialog(new ug.i0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                return;
            } else {
                filtersSetupActivity.presentFragment(new iz(voVar, null));
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
        g00 g00Var = filtersSetupActivity.b;
        int i11 = filtersSetupActivity.s;
        g00Var.k(i11, filtersSetupActivity.w - i11);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131750696, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 2));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = 3;
        bt btVar = new bt(i10, context, this);
        this.a = btVar;
        btVar.r1();
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
        v4.y yVar = new v4.y(new org.telegram.ui.Components.ez(this));
        this.c = yVar;
        yVar.h(this.a);
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        bt btVar2 = this.a;
        g00 g00Var = new g00(this, context);
        this.b = g00Var;
        btVar2.setAdapter(g00Var);
        this.a.setOnItemClickListener(new ru(i10, this, context));
        if (this.f) {
            g0(false);
            this.f = false;
            this.a.v0(this.b.b() - 1);
            org.telegram.messenger.g0.i3(new b00(this, i7), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.q4 q4Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().L4 && !getUserConfig().q()) || size >= getMessagesController().M4) {
            showDialog(new ug.i0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (q4Var != null) {
            ((ActionBarLayout) q4Var).S(new iz(null, null));
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

    public final void f0(b00 b00Var) {
        if (!this.e) {
            if (b00Var != null) {
                b00Var.run();
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
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(b00Var, 8));
    }

    public final void g0(boolean z9) {
        this.showTagsRow = -1;
        bt btVar = this.a;
        if (btVar != null) {
            ArrayList arrayList = btVar.K2;
            if (arrayList == null) {
                btVar.K2 = new ArrayList();
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
        arrayList3.add(new e00(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M0 = org.telegram.messenger.id.M0(2131750718, null);
            e00 e00Var = new e00(0, false);
            e00Var.c = M0;
            arrayList3.add(e00Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                e00 e00Var2 = new e00(5, false);
                e00Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(e00Var2);
            }
            bt btVar2 = this.a;
            if (btVar2 != null) {
                btVar2.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            e00 e00Var3 = new e00(3, false);
            e00Var3.c = null;
            arrayList3.add(e00Var3);
        }
        if (T0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String M02 = org.telegram.messenger.id.M0(2131750696, null);
            e00 e00Var4 = new e00(0, false);
            e00Var4.c = M02;
            arrayList3.add(e00Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < T0.size(); i11++) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i11);
                e00 e00Var5 = new e00(2, false);
                e00Var5.d = voVar;
                arrayList3.add(e00Var5);
                if (org.telegram.messenger.qp.s1(this.currentAccount).A7 && ((org.telegram.messenger.vo) T0.get(i11)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            bt btVar3 = this.a;
            if (btVar3 != null) {
                btVar3.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(this.s, (size2 - 1) + (T0.size() >= getMessagesController().M4 ? 0 : 1))));
            }
        }
        if (T0.size() < getMessagesController().M4) {
            String M03 = org.telegram.messenger.id.M0(2131751716, null);
            e00 e00Var6 = new e00(4, false);
            e00Var6.c = M03;
            arrayList3.add(e00Var6);
        }
        e00 e00Var7 = new e00(3, false);
        e00Var7.c = null;
        arrayList3.add(e00Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M04 = org.telegram.messenger.id.M0(2131750625, null);
        e00 e00Var8 = new e00(6, false);
        e00Var8.c = M04;
        arrayList3.add(e00Var8);
        CharSequence S2 = !getUserConfig().q() ? org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750623, null), org.telegram.ui.ActionBar.l6.L6, 2, new b00(this, i7), null) : org.telegram.messenger.id.M0(2131750624, null);
        e00 e00Var9 = new e00(3, false);
        e00Var9.c = S2;
        arrayList3.add(e00Var9);
        g00 g00Var = this.b;
        if (g00Var != null) {
            if (z9) {
                g00Var.E(arrayList2, arrayList3);
            } else {
                g00Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.a, 16, new Class[]{org.telegram.ui.Cells.n4.class, i00.class, h00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.a, 196608, new Class[]{c00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ji));
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
        g00 g00Var = this.b;
        if (g00Var != null) {
            g00Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
